/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author danis
 */
public class Lab8 {

    public static void main(String[] args) {
        try {
            AuthorDAO authorDAO = new AuthorDAO();
            authorDAO.addAuthor(new Author(0, "J.K. Rowling"));
            System.out.println("Author added successfully!");

            BookDAO bookDAO = new BookDAO();
            java.sql.Date date = java.sql.Date.valueOf("2021-01-01");
            bookDAO.addBook(new Book(0, "Harry Potter and the Philosopher's Stone", 1, "English", date, 330));
            System.out.println("Book added successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
