/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab13;

/**
 *
 * @author danis
 */


import com.mycompany.com.DisplayLocales;
import com.mycompany.com.Info;
import com.mycompany.com.SetLocale;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Lab13{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DisplayLocales displayLocales = new DisplayLocales();
        SetLocale setLocale = new SetLocale();
        Info info = new Info();
        ResourceBundle messages = ResourceBundle.getBundle("res.Messages_ro", Locale.getDefault());

        while (true) {
            System.out.print(messages.getString("prompt"));
            String command = scanner.nextLine();
            
            if (command.equalsIgnoreCase("locales")) {
                displayLocales.execute();
            } else if (command.startsWith("set ")) {
                String languageTag = command.substring(4);
                setLocale.execute(languageTag);
                messages = ResourceBundle.getBundle("res.Messages", Locale.getDefault());
            } else if (command.equalsIgnoreCase("info")) {
                info.execute();
            } else {
                System.out.println(messages.getString("invalid"));
            }
        }
    }
}    