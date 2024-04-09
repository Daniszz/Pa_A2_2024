/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author danis
 */
public class Game {
 List<Player> playersList;


    public Game() {
        this.playersList = new ArrayList<>();
    }



    public void addNewPlayer(Player player)
    {
        this.playersList.add(player);
    }

    public void play() {
        for (Player player: this.playersList)
        {
            Thread thread = new Thread(player);
            thread.start();
        }
    }   
}
