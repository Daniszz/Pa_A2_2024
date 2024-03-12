/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2;

/**
 *
 * @author danis
 */
/**
 
Represents a drone, a type of vehicle.*/
public class Drone extends Vehicle{
    private int maxFlightDuration;

    public Drone(String name, int maxFlightDuration) {
        super(name);
        this.maxFlightDuration = maxFlightDuration;
    }

    public Drone(String name, Depot depot, int maxFlightDuration) {
        super(name, depot);
        this.maxFlightDuration = maxFlightDuration;
    }

    public int getMaxFlightDuration() {
        return maxFlightDuration;
    }

    public void setMaxFlightDuration(int maxFlightDuration) {
        this.maxFlightDuration = maxFlightDuration;
    }

   @Override
    public String toString() {
        return "Drone{" +
                "name= " + getName() + ' ' +
                ", depot=" + getDepot() +
                ", maxFlightDuration=" + maxFlightDuration +
                '}';
    }

}