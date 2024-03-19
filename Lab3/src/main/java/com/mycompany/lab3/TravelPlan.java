/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author danis
 */
public class TravelPlan {
    private Map<Attraction, LocalDate> plan = new HashMap<>();

    /**
     *
     * @param attraction
     * @param date
     */
    public void addPlan(Attraction attraction, LocalDate date) {
        plan.put(attraction, date);
    }

    /**
     *
     */
    public void printPlan() {
        plan.forEach((attraction, date) -> System.out.println(date + ": " + attraction.getName()));
    }
}
