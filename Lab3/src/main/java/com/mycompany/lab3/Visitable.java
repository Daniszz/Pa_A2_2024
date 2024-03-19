/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.lab3;
import java.time.LocalTime;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author danis
 * @param <T>
 */
public interface Visitable<T extends Comparable<T>> {

    /**
     *
     * @return
     */
    Map<LocalDate, Pair<T, T>> getTimetable();

    /**
     *
     * @param date
     * @return
     */
    default LocalTime getOpeningHour(LocalDate date) {
        Map<LocalDate, Pair<T, T>> timetable = getTimetable();
        if (timetable.containsKey(date)) {
            return (LocalTime) timetable.get(date).getKey();
        }
        return null;
    }
}


