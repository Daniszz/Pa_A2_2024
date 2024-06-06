/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab12;

/**
 *
 * @author danis
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleTest2 {

    @Test
    public static void testStaticMethod() {
        System.out.println("Static method test passed.");
    }

    @Test
    public void testInstanceMethod() {
        System.out.println("Instance method test passed.");
    }

    @Test
    public void testMethodWithParameters(int num, String str) {
        System.out.println("Method with parameters test passed. Parameters: " + num + ", " + str);
    }
      @Test
    public static void testFailingTest() {
        fail("This test should fail.");
    }
}
