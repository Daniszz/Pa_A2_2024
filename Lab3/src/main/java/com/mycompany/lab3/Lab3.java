/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab3;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Map;

/**
 *
 * @author danis
 */
public class Lab3 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
Trip trip = new Trip("CityX", LocalDate.of(2024, 3, 1), LocalDate.of(2024, 3, 10));

        Statue statue = new Statue("Statuie");
        Church church = new Church("Biserica");
        Concert concert = new Concert("Music Festival", 50.0);

        church.setTimetable(Map.of(LocalDate.of(2024, 3, 1), new Pair<>(LocalTime.of(9, 0), LocalTime.of(17, 0))));
        concert.setTimetable(Map.of(LocalDate.of(2024, 3, 2), new Pair<>(LocalTime.of(10, 0), LocalTime.of(22, 0))));

        trip.addAttraction(statue);
        trip.addAttraction(church);
        trip.addAttraction(concert);

        trip.displayVisitableNotPayable();

        TravelPlan travelPlan = new TravelPlan();
        travelPlan.addPlan(statue, LocalDate.of(2024, 3, 1));
        travelPlan.addPlan(church, LocalDate.of(2024, 3, 2));
        travelPlan.addPlan(concert, LocalDate.of(2024, 3, 3));

        travelPlan.printPlan();
    }
    }







    


