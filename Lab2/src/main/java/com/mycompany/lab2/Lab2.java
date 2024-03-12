/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab2;
import java.time.LocalTime;

/**
 *
 * @author danis
 */




public class Lab2 {

   public static void main(String[] args) {
Depot depot1 = new Depot("Depot 1");
        Depot depot2 = new Depot("Depot 2");

        Truck truck1 = new Truck("Truck 1", depot1, 10);
        Truck truck2 = new Truck("Truck 2", depot2, 15);
        Drone drone1 = new Drone("Drone 1", depot1, 60);
        Drone drone2 = new Drone("Drone 2", depot2, 90);

        depot1.setVehicles(truck1, drone1);
        depot2.setVehicles(truck2, drone2);

        Problem problem = new Problem(new Depot[]{depot1, depot2}, new Client[0]);

        Vehicle[] allVehicles = problem.getVehicles();

        System.out.println("All Vehicles:");
        for (Vehicle vehicle : allVehicles) {
            System.out.println(vehicle);
        }
    }
}
