/**
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7;

/**
 *
 * @author danis
 */
public class Lab7 {
 public static void main(String []args) {
        Game game= new Game();

        game.addNewPlayer(new Player("A"));
        game.addNewPlayer(new Player("B"));
        game.addNewPlayer(new Player("C"));

        game.play();
    }
}
