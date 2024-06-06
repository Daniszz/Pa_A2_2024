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

public class DisplayLocales {
    public void execute() {
        ResourceBundle messages = ResourceBundle.getBundle("res.Messages_ro", Locale.getDefault());
        System.out.println(messages.getString("locales"));
        Locale[] availableLocales = Locale.getAvailableLocales();
        for (Locale locale : availableLocales) {
            System.out.println(locale);
        }
    }
}