package com.mycompany.lab5;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Repository {
    private String directory;
    private Map<Person, List<Document>> documents = new HashMap<>();

    public Repository(String directory) throws InvalidRepositoryException {
        this.directory = directory;
        loadDocuments();
    }

    private void loadDocuments() throws InvalidRepositoryException {
        File masterDir = new File(directory);
        if (!masterDir.exists() || !masterDir.isDirectory()) {
            throw new InvalidRepositoryException(new Exception("Invalid master directory path."));
        }

        File[] persoane = masterDir.listFiles(File::isDirectory);
        if (persoane == null) {
            throw new InvalidRepositoryException(new Exception("No person directories found in the master directory."));
        }

        for (File persoana : persoane) {
            int id;
            String name = persoana.getName(); 
            try {
                id = Integer.parseInt(name); 
            } catch (NumberFormatException e) {
                System.err.println("Invalid person directory name: " + name);
                continue;
            }

            File[] files = persoana.listFiles();
            if (files == null) {
                System.err.println("No files found in the person directory: " + name);
                continue;
            }

            List<Document> personDocuments = new ArrayList<>();
            for (File file : files) {
                String fileType = getFileType(file);
                if (fileType != null) {
                    Document doc = new Document(file.getName(), fileType, file.getAbsolutePath(), file.length());
                    personDocuments.add(doc);
                }
            }

            Person person = new Person(id, name);
            documents.put(person, personDocuments);
        }
    }

    private String getFileType(File file) {
        String fileName = file.getName();
        int dotIndex = fileName.lastIndexOf('.');
        if (dotIndex > 0 && dotIndex < fileName.length() - 1) {
            return fileName.substring(dotIndex + 1).toLowerCase();
        }
        return null;
    }

    public void displayRepositoryContents() {
        for (Map.Entry<Person, List<Document>> entry : documents.entrySet()) {
            System.out.println("Person: " + entry.getKey());
            System.out.println("Documents:");
            for (Document document : entry.getValue()) {
                System.out.println(document);
            }
            System.out.println();
        }
    }
}
