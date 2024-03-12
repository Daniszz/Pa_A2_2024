/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.lab3;
import java.time.LocalTime;

import java.time.LocalDate;
import java.util.Map;

/**
 *
 * @author danis
 */
public interface Visitable {
Map<LocalDate, TimeInterval> getTimetable();
    default TimeInterval getOpeningHour(LocalDate date) {
        Map<LocalDate, TimeInterval> timetable = getTimetable();
        return timetable.getOrDefault(date, TimeInterval.CLOSED);
    }
}


