/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab8;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author danis
 */
public class BookDAO {
    public void addBook(Book book) throws SQLException {
        String query = "INSERT INTO Books (title, authorId, language, publicationDate, pageCount) VALUES (?, ?, ?, ?, ?)";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, book.getTitle());
            statement.setInt(2, book.getAuthorId());
            statement.setString(3, book.getLanguage());
            statement.setDate(4, book.getPublicationDate());
            statement.setInt(5, book.getPageCount());
            statement.executeUpdate();
        }
    }
}
