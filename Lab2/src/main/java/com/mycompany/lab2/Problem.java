/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2;

/**
 *
 * @author danis
 */

 
import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;



/**Represents a problem, which consists of depots and clients.
 */
public class Problem {
    private Depot[] depots;
    private Client[] clients;

    public Problem(Depot[] depots, Client[] clients) {
        this.depots = depots;
        this.clients = clients;
    }

    Problem() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setClients(Client[] clients) {
        this.clients = clients;
    }

    public void setDepots(Depot[] depots) {
        this.depots = depots;
    }

    public Client[] getClients() {
        return clients;
    }

    public Depot[] getDepots() {
        return depots;
    }

 /**
Retrieves all vehicles from all depots.
@return An array of vehicles.
*/
  public Vehicle[] getVehicles() {
      List<Vehicle> allVehicles = new ArrayList<>();
      for (Depot depot : depots) {
          Vehicle[] vehicles = depot.getVehicles();
          if (vehicles != null) {
              allVehicles.addAll(Arrays.asList(vehicles));}}
      return allVehicles.toArray(new Vehicle[0]);}
}
