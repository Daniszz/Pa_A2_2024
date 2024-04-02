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
public class ExportCommand implements Command{
    private final Repository repository;
    private final String filePath;

    public ExportCommand(Repository repository, String filePath) {
        this.repository = repository;
        this.filePath = filePath;
    }

    @Override
    public void execute() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File(filePath), repository);
    }
}
