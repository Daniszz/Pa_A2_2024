/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab4;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 *
 * @author danis
 */
public class Lab4 {

    public static void main(String[] args) {
          LinkedList<Driver> drivers = new LinkedList<>();
        TreeSet<Passenger> passengers = new TreeSet<>((p1, p2) -> p1.getName().compareTo(p2.getName()));
        Driver driver1 = new Driver("Alex", 30, "Office");
        Driver driver2 = new Driver("Andrei", 25, "Airport");
        Driver driver3 = new Driver("Cristi", 35, "Mall");
        
        Passenger passenger1 = new Passenger("Emilia", 28, "Office");
        Passenger passenger2 = new Passenger("David", 22, "Airport");
        Passenger passenger3 = new Passenger("Anca", 40, "Mall");

        drivers.add(driver1);
        drivers.add(driver2);
        drivers.add(driver3);

        passengers.add(passenger1);
        passengers.add(passenger2);
        passengers.add(passenger3);
        
      drivers.stream()
                .sorted(Comparator.comparingInt(Driver::getAge))
                .collect(Collectors.toList())
                .forEach(System.out::println);
      
                        passengers.forEach(System.out::println);

        
    }}
