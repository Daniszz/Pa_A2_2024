/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;

/**
 *
 * @author danis
 */
public record Document(String fileName, String fileType, String filePath, long fileSize) {
    @Override
    public String toString() {
        return "Document{" +
                "fileName='" + fileName + '\'' +
                ", fileType='" + fileType + '\'' +
                ", filePath='" + filePath + '\'' +
                ", fileSize=" + fileSize +
                '}';
    }
}