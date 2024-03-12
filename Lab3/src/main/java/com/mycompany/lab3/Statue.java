/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

import java.time.LocalDate;
import java.util.Map;

/**
 *
 * @author danis
 */
public class Statue 
    extends Attraction
implements Visitable, Payable {
 private Map<LocalDate, TimeInterval> timetable;
 private double ticketPrice;

    public Statue(String name) {
        super(name);
    }
 @Override
 public Map<LocalDate,TimeInterval> getTimetable() {
 return timetable;
 }
 public void setTimetable(Map<LocalDate, TimeInterval> timetable) {
 this.timetable = timetable;
 }
 @Override
 public double getTicketPrice() {
 return ticketPrice;
 }
}
