/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab8;

import java.sql.Date;

/**
 *
 * @author danis
 */
public class Book {
     private int id;
    private String title;
    private int authorId;
    private String language;
    private Date publicationDate;
    private int pageCount;

    public Book(int id, String title, int authorId, String language, Date publicationDate, int pageCount) {
        this.id = id;
        this.title = title;
        this.authorId = authorId;
        this.language = language;
        this.publicationDate = publicationDate;
        this.pageCount = pageCount;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getAuthorId() {
        return authorId;
    }

    public String getLanguage() {
        return language;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

  
    
}
