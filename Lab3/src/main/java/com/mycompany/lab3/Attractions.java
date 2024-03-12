/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

/**
 *
 * @author danis
 */
abstract class Attraction implements Comparable<Attraction> {
    protected String name;

    public Attraction(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Attraction{" + "name=" + name + '}';
    }
    
    @Override
    public int compareTo(Attraction other) {
        return this.name.compareTo(other.name);
    }
} 
