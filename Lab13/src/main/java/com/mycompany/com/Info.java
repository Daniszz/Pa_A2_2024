/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.com;

/**
 *
 * @author danis
 */
import java.util.Currency;
import java.util.Date;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.util.Locale;
import java.util.ResourceBundle;

public class Info {
    public void execute() {
        Locale locale = Locale.getDefault();
        ResourceBundle messages = ResourceBundle.getBundle("res.Messages_ro", locale);

        DateFormatSymbols symbols = new DateFormatSymbols(locale);
        Currency currency = Currency.getInstance(locale);
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, locale);

        System.out.println(String.format(messages.getString("info"), locale));
        System.out.println("Country: " + locale.getDisplayCountry() + " (" + locale.getCountry() + ")");
        System.out.println("Language: " + locale.getDisplayLanguage() + " (" + locale.getLanguage() + ")");
        System.out.println("Currency: " + currency.getCurrencyCode() + " (" + currency.getDisplayName() + ")");
        System.out.println("Week Days: " + String.join(", ", symbols.getWeekdays()));
        System.out.println("Months: " + String.join(", ", symbols.getMonths()));
        System.out.println("Today: " + dateFormat.format(date));
    }
}