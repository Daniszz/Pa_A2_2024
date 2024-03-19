/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author danis
 */
public class Trip {
    private String city;
    private LocalDate start,end;
    private final List<Attraction> attractions=new ArrayList<>();

    /**
     *
     * @param city
     * @param start
     * @param end
     */
    public Trip(String city, LocalDate start, LocalDate end) {
        this.city = city;
        this.start = start;
        this.end = end;
    }

    /**
     *
     * @param attraction
     */
    public void addAttraction(Attraction attraction) {
        attractions.add(attraction);
    }

    /**
     *
     * @return
     */
    public List<Attraction> getAttractions() {
        return attractions;
    }

    /**
     *
     */
    public void displayVisitableNotPayable() {
    List<Attraction> visitableNotPayable = new ArrayList<>();
        for (Attraction attraction : attractions) {
            if (attraction instanceof Visitable && !(attraction instanceof Payable)) {
                visitableNotPayable.add(attraction);
            }
        }
        Collections.sort(visitableNotPayable);
        for (Attraction attraction : visitableNotPayable) {
            System.out.println(attraction);
        }
}

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Trip{" + "city=" + city + ", start=" + start + ", end=" + end + ", attractions=" + attractions + '}';
    }
    
}
