/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.example.util.Token;

/**
 *
 * @author danis
 */
public class Bag {
 private final List<Token> bag;

    public Bag() {
        this.bag = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 4; i++)
        {
            int randomInt = random.nextInt(12);
            this.bag.add(new Token(randomInt,randomInt+1));
        }
    }
  public synchronized Token extractToken() {
  Token extractedToken = this.bag.get(0);
  this.bag.remove(0);
  return extractedToken;
}
    public List<Token> getBag() {
        return this.bag;
    }

    public boolean isEmptyBag() {
        return this.bag.isEmpty();
    }
}
