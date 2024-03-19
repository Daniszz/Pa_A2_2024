/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author danis
 */
public class Church 
        extends Attraction
implements Visitable {
  private Map<LocalDate, Pair<LocalTime, LocalTime>> timetable = new HashMap<>();

    /**
     *
     * @param name
     */
    public Church(String name) {
        super(name);
    }

    /**
     *
     * @return
     */
    @Override
    public Map<LocalDate, Pair<LocalTime, LocalTime>> getTimetable() {
        return timetable;
    }

    /**
     *
     * @param timetable
     */
    public void setTimetable(Map<LocalDate, Pair<LocalTime, LocalTime>> timetable) {
        this.timetable = timetable;
    }
}

