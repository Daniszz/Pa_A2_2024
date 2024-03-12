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

    /**
     *
     * @param name
     * @param maxFlightDuration
     */
    public Drone(String name, int maxFlightDuration) {
        super(name);
        this.maxFlightDuration = maxFlightDuration;
    }

    /**
     *
     * @param name
     * @param depot
     * @param maxFlightDuration
     */
    public Drone(String name, Depot depot, int maxFlightDuration) {
        super(name, depot);
        this.maxFlightDuration = maxFlightDuration;
    }

    /**
     *
     * @return
     */
    public int getMaxFlightDuration() {
        return maxFlightDuration;
    }

    /**
     *
     * @param maxFlightDuration
     */
    public void setMaxFlightDuration(int maxFlightDuration) {
        this.maxFlightDuration = maxFlightDuration;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Drone{" +
                "name= " + getName() + ' ' +
                ", depot=" + getDepot() +
                ", maxFlightDuration=" + maxFlightDuration +
                '}';
    }

}