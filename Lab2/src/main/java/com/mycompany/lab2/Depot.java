/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2;

import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author danis
 */
/**
 
Represents a depot.*/
public class Depot {
    private String name;
    private Vehicle[] vehicles;

    /**
     *
     * @param name
     */
    public Depot(String name) {
        this.name = name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param vehicles
     */
    public void setVehicles(Vehicle... vehicles) {
        this.vehicles = vehicles;
        for (Vehicle v : vehicles) {
            v.setDepot(this);
        }
    }

    /**
     *
     * @return
     */
    public Vehicle[] getVehicles() {
        return vehicles;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.name);
        return hash;
    }

    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Depot other = (Depot) obj;
        return Objects.equals(this.name, other.name);
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Depot{" + "name=" + name + '}';
    }



}