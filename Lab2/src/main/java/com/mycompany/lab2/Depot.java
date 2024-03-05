/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2;

import java.util.Arrays;

/**
 *
 * @author danis
 */
public class Depot {
    private String name;
    //private Vehicle[] vehicles;

    public Depot(String name) {
        this.name = name;
    }

   /* public void setVehicles(Vehicle...vehicles) {
        this.vehicles = vehicles;
        for(Vehicle v : vehicles)
        {
            v.setDepot(this);
        }
    }

    public Vehicle[] getVehicles() {
        return vehicles;
    }*/
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Depot{" + "name=" + name + '}';
    }

   

   
}
