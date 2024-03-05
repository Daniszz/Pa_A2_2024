/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2;

import java.util.Objects;

/**
 *
 * @author danis
 */
public class Vehicle {
    private String name;
    private Depot depot;

    public Vehicle(String name, Depot depot) {
        this.name = name;
        this.depot = depot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Depot getDepot() {
        return depot;
    }

    public void setDepot(Depot depot) {
        this.depot = depot;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "name=" + name + ", depot=" + depot + '}';
    }
   /*  @Override
 public boolean equals(Object obj) {
 if (obj == null || !(obj instanceof Vehicle)) {
 return false;
 }
 Vehicle other = (Vehicle) obj;
 return name.equals(other.name);
 }
*/
 
}
