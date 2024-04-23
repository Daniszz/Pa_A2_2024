/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author danis
 */
public class Lab8 {

    public static void main(String[] args) {
  try {
            AuthorDAO authorDAO = new AuthorDAO();
            authorDAO.addAuthor("J.K. Rowling");

            Statement statement = DatabaseConnection.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM authors");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        }
}
