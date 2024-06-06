/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab12;

/**
 *
 * @author danis
 */

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class Lab12 {

    private static int totalTests = 0;
    private static int successfulTests = 0;
    private static int failedTests = 0;

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java Lab12 <class-name | directory | jar-file>");
            return;
        }

        String inputPath = args[0];
        try {
            File file = new File(inputPath);
             if (file.isDirectory()) {
        System.out.println("Input is a directory: " + inputPath);
        processDirectory(file);
            } else if (inputPath.endsWith(".jar")) {
                // handle .jar file
            } else {
                Class<?> clazz = loadClass(inputPath);
                processClass(clazz);
            }
            printStatistics();
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void processDirectory(File directory) throws ClassNotFoundException, IOException {
        Files.walk(Paths.get(directory.getPath()))
                .filter(Files::isRegularFile)
                .filter(p -> p.toString().endsWith(".java"))
                .forEach(path -> {
                    String className = getClassNameFromPath(path, directory);
                    try {
                        Class<?> clazz = loadClass(className);
                        processClass(clazz);
                    } catch (ClassNotFoundException e) {
                        System.err.println("Class not found: " + className);
                        e.printStackTrace();
                    }
                });
    }

    private static String getClassNameFromPath(Path path, File baseDir) {
        String relativePath = baseDir.toURI().relativize(path.toUri()).getPath();
        return relativePath.replace('/', '.').replace('\\', '.').replace(".class", "");
    }

    private static Class<?> loadClass(String className) throws ClassNotFoundException {
        URL classURL = Lab12.class.getProtectionDomain().getCodeSource().getLocation();
        URL[] urls = {classURL};
        try (URLClassLoader urlClassLoader = new URLClassLoader(urls)) {
            return Class.forName(className, true, urlClassLoader);
        } catch (Exception e) {
            throw new ClassNotFoundException("Unable to load class: " + className, e);
        }
    }

    private static void processClass(Class<?> clazz) {
        extractClassInformation(clazz);
        invokeTestMethods(clazz);
    }

    private static void extractClassInformation(Class<?> clazz) {
        System.out.println("Class: " + clazz.getName());

        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Method: " + method.getName()
                    + ", Return type: " + method.getReturnType()
                    + ", Modifiers: " + Modifier.toString(method.getModifiers()));
        }
    }

    private static void invokeTestMethods(Class<?> clazz) {
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Test.class)) {
                totalTests++;
                boolean success = false;
                try {
                    method.setAccessible(true);
                    if (method.getParameterCount() == 0) {
                        method.invoke(method.getModifiers() == Modifier.STATIC ? null : clazz.getDeclaredConstructor().newInstance());
                    } else {
                        Object[] mockParams = createMockParams(method.getParameterTypes());
                        method.invoke(method.getModifiers() == Modifier.STATIC ? null : clazz.getDeclaredConstructor().newInstance(), mockParams);
                    }
                    success = true;
                    System.out.println("Invoked @Test Method: " + method.getName());
                } catch (Exception e) {
                    failedTests++;
                    System.err.println("Failed to invoke method: " + method.getName());
                    e.printStackTrace();
                }
                if (success) successfulTests++;
            }
        }
    }

    private static Object[] createMockParams(Class<?>[] parameterTypes) {
        List<Object> params = new ArrayList<>();
        for (Class<?> paramType : parameterTypes) {
            if (paramType == int.class || paramType == Integer.class) {
                params.add(0); 
            } else if (paramType == long.class || paramType == Long.class) {
                params.add(0L); 
            } else if (paramType == double.class || paramType == Double.class) {
                params.add(0.0);
            } else if (paramType == float.class || paramType == Float.class) {
                params.add(0.0f); 
            } else if (paramType == boolean.class || paramType == Boolean.class) {
                params.add(false); 
            } else if (paramType == char.class || paramType == Character.class) {
                params.add('a');
            } else if (paramType == String.class) {
                params.add(""); 
            } else {
                params.add(null); 
            }
        }
        return params.toArray();
    }

    private static void printStatistics() {
        System.out.println("\nTest Statistics:");
        System.out.println("Total tests: " + totalTests);
        System.out.println("Successful tests: " + successfulTests);
        System.out.println("Failed tests: " + failedTests);
    }
}
