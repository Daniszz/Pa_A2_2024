/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author danis
 */
public class ViewCommand implements Command{
 private final String filePath;

    public ViewCommand(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void execute() throws IOException {
        Desktop.getDesktop().open(new File(filePath));   
}
}
