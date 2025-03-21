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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.Collections;
import java.util.Stack;

public class Bag {
    private final Stack<Token> tokens = new Stack<>();

    public Bag(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i != j) {
                    tokens.add(new Token(i, j));
                    tokens.add(new Token(j, i)); 
                }
            }
        }
        Collections.shuffle(tokens);
    }

    public synchronized Token extractToken() {
        return tokens.isEmpty() ? null : tokens.pop();
    }

    public synchronized boolean isEmpty() {
        return tokens.isEmpty();
    }
}
