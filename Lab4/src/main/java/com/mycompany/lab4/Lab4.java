/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab4;

/**
 *
 * @author danis
 */
public class Lab4 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
  Carpooling problem = new Carpooling();
        problem.randomPersons(3, 3);
problem.Example();
        System.out.println("Sorted Drivers:");
        problem.printSortedDrivers();

        System.out.println("\nSorted Passengers:");
        problem.printSortedPassengers();

        System.out.println("\nDestinations:");
        System.out.println(problem.getDestinations());

        System.out.println("\nDestination Map:");
        System.out.println(problem.getDestinationMap());

              System.out.println("\nGreedy Matching:");
        problem.greedyMatching();
    }}
