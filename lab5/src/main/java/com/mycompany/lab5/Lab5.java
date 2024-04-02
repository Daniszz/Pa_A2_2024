/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab5;

/**
 *
 * @author danis
 */
public class Lab5 {

    public static void main(String[] args){
 try {
            Repository repository = new Repository("C:\\Users\\hritc\\OneDrive\\Documents\\GitHub\\Pa_A2_2024\\lab5\\src\\master directory");
            CommandExecutor executor = new CommandExecutor(repository);
            executor.start();
        } catch (InvalidRepositoryException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }    }

