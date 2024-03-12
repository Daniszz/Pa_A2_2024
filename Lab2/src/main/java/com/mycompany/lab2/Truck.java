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
 
Represents a truck, a type of vehicle.*/
public class Truck extends Vehicle {
    private int capacity;

    /**
     *
     * @param name
     * @param capacity
     */
    public Truck(String name, int capacity) {
        super(name);
        this.capacity = capacity;
    }

    /**
     *
     * @param name
     * @param depot
     * @param capacity
     */
    public Truck(String name, Depot depot, int capacity) {
        super(name, depot);
        this.capacity = capacity;
    }

    /**
     *
     * @param capacity
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     *
     * @return
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     *
     * @return
     */
    @Override
   public String toString() {
        return "Truck{" +
                "name= " + getName() + ' ' +
                ", depot=" + getDepot() +
                ", capacity=" + capacity +
                '}';
    }


}