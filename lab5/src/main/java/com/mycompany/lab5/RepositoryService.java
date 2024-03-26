/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author danis
 */
public class RepositoryService {
private final ObjectMapper objectMapper = new ObjectMapper();

    public void export(Repository repo, String path) throws IOException {
        objectMapper.writeValue(new File(path), repo);
    }

    public Repository read(String path) throws IOException {
        return objectMapper.readValue(new File(path), Repository.class);
    }

}
