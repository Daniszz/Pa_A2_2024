/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

/**
 *
 * @author danis
 */
class Passenger extends Person {
    public Passenger(String name, int age, String destination) {
        super(name, age, destination);
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", destination='" + getDestination() + '\'' +
                '}';
    }
}