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
        /*Depot depot = new Depot("Depot 1");
       
        Vehicle vehicle1 = new Vehicle("Vehicle 1", depot);
        depot.setVehicles(vehicle1);
        Client client1 = new Client("Client 1", ClientType.REGULAR,LocalTime.of(8, 0), LocalTime.of(10, 0));
        System.out.println(depot);
        System.out.println(vehicle1);
        System.out.println(client1);
        */
        Client c1 = new Client();
c1.setName("Client 1");
c1.setMinTime(LocalTime.of(8, 0));
c1.setMaxTime(LocalTime.of(12, 30));
System.out.println(c1.getName());
Client c2 = new Client("Client 2");
System.out.println(c2); 
Client c3 = new Client("Client 3",ClientType.REGULAR,
LocalTime.NOON, LocalTime.MIDNIGHT);
System.out.println(c3); 

        }
}
