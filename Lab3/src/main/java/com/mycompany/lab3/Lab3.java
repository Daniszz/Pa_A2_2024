/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab3;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author danis
 */
public class Lab3 {

    public static void main(String[] args) {
 Concert concert = new Concert("Music Festival");
        concert.setTimetable(createTimetable());

        Statue statue = new Statue("Statue of Liberty");
        statue.setTimetable(createTimetable());

        Church church = new Church("St. Peter's Basilica");
        church.setTimetable(createTimetable());

        LocalDate startDate = LocalDate.of(2024, 7, 1);
        LocalDate endDate = LocalDate.of(2024, 7, 10);
        Trip trip = new Trip("New York City", startDate, endDate);

        trip.addAttraction(concert);
        trip.addAttraction(statue);
        trip.addAttraction(church);

        System.out.println(trip);
    }

    private static Map<LocalDate, TimeInterval> createTimetable() {
        Map<LocalDate, TimeInterval> timetable = new HashMap<>();
        timetable.put(LocalDate.of(2024, 7, 2), TimeInterval.MORNING);
        timetable.put(LocalDate.of(2024, 7, 4), TimeInterval.AFTERNOON);
        timetable.put(LocalDate.of(2024, 7, 6), TimeInterval.EVENING);
        return timetable;
    }







    

}
