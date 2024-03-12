/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

import java.time.LocalTime;

/**
 *
 * @author danis
 */
enum TimeInterval {
    CLOSED(LocalTime.MIDNIGHT, LocalTime.MIDNIGHT),
    MORNING(LocalTime.of(9, 0), LocalTime.of(12, 0)),
    AFTERNOON(LocalTime.of(13, 0), LocalTime.of(17, 0)),
    EVENING(LocalTime.of(18, 0), LocalTime.of(22, 0));

    private final LocalTime startTime;
    private final LocalTime endTime;

    TimeInterval(LocalTime startTime, LocalTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public boolean isOpen(LocalTime time) {
        return time.compareTo(startTime) >= 0 && time.compareTo(endTime) < 0;
    }
}
