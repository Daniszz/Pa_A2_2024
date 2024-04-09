/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7;
import org.example.util.Token;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author danis
 */
public class Player implements Runnable {
   String name;
    Bag bag;
    boolean running = true;
    List<Token> tokens;

    public Player(String name) {
        this.name = name;
        this.tokens = new ArrayList<>();
        this.bag = new Bag();
    }

    public void run() {
        while (running && !this.bag.isEmptyBag()) {
            Token token = (Token) bag.extractToken();
            System.out.println(this.name+" "+token);
        }
    }
}