/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab12;

import org.junit.Test;

/**
 *
 * @author danis
 */


public class Timekeeper extends Thread {
    private final long limit;
    private final Thread[] players;

    public Timekeeper(long limit, Thread... players) {
        this.limit = limit;
        this.players = players;
        setDaemon(true);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(limit);
            System.out.println("Time limit reached. Stopping all players.");
            for (Thread player : players) {
                player.interrupt();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}


