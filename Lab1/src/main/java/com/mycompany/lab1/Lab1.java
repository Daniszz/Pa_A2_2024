/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab1;

import java.util.Random;

/**
 *
 * @author danis
 */
public class Lab1 {

    public static void main(String args[]) {
        Lab1 lab1 = new Lab1();
        lab1.compulsory();
        lab1.homework(args);
        lab1.bonus();
    }

    void compulsory() {
        System.out.println("Hello World!");
        String[] languages = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
        int n = (int) (Math.random() * 1_000_000);
        int result = n * 3;
        String binar = "10101";
        String hexadecimal = "FF";
        int cifra1 = Integer.parseInt(binar, 2);
        int cifra2 = Integer.parseInt(hexadecimal, 16);
        result = result + cifra1 + cifra2;
        result = result * 6;
        while (result > 9) {
            int sum = 0;
            int copie = result;
            while (copie > 0) {
                sum = sum + copie % 10;
                copie = copie / 10;
            }
            result = sum;
        }
        System.out.println("Willy-nilly,this semester i will learn " + languages[result]);
    }

    void homework(String[] args) {
        if (args.length < 3) {
            System.out.println(
                    "Usage: number, number, number");
            System.exit(-1);
        }
        long startTime = System.nanoTime();

        int inceputInterval, sfarsitInterval, k;
        inceputInterval = Integer.parseInt(args[0]);
        sfarsitInterval = Integer.parseInt(args[1]);
        k = Integer.parseInt(args[2]);

        if (inceputInterval > sfarsitInterval) {
            System.out.println("Interval invalid");
            System.exit(-1);
        }

        String rezultat = "";
        for (int i = inceputInterval; i <= sfarsitInterval; i++) {
            if (verificareKRed(i, k)) {
                rezultat = rezultat + Integer.toString(i) + " ";
            }
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Rezultatul este: " + rezultat);
        System.out.println("Timp executie: " + duration + " nanoseconds");

    }

    private static boolean verificareKRed(int numar, int k) {
        while (numar > 9) {
            int sum = 0;
            while (numar > 0) {
                sum = sum + (numar % 10) * (numar % 10);
                numar = numar / 10;
            }
            numar = sum;
        }

        return numar == k;
    }

    void bonus() {
        Random rand = new Random();
        int n = rand.nextInt((15 - 7) + 1) + 7;
        int[][] matrice = new int[n][n];
        for (int i = 1; i < n; i++) {
            matrice[0][i] = 1;
            matrice[i][0] = 1;
        }
        for (int i = 1; i < n - 1; i++) {
            matrice[i][i + 1] = 1;
            matrice[i + 1][i] = 1;
        }
        matrice[n - 1][1] = 1;
        matrice[1][n - 1] = 1;

        System.out.println("Matricea adiacenta pentru W" + n + ":");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
        int cicluri = 1;
        // Deorece avem un wheel graph, o sa avem n-1 noduri conectate la un nod central de grad n-1, numarul de posibilitati ale ciclurilor este combinari de n-1 luate cate 2.
        cicluri = cicluri + (n - 1) * (n - 2);
        System.out.println("Numarul de cicluri este :" + cicluri);
        int expected = n * n - 3 * n + 3;
        System.out.println("Numarul asteptat de cicluri: " + expected);

    }

}
