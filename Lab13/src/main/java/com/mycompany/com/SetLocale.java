/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.com;

/**
 *
 * @author danis
 */
import java.util.Locale;
import java.util.ResourceBundle;

public class SetLocale {
    private Locale currentLocale;

    public void execute(String languageTag) {
        this.currentLocale = Locale.forLanguageTag(languageTag);
        Locale.setDefault(this.currentLocale);
        ResourceBundle messages = ResourceBundle.getBundle("res.Messages_ro", Locale.getDefault());
        System.out.println(String.format(messages.getString("locale.set"), currentLocale));
    }
}