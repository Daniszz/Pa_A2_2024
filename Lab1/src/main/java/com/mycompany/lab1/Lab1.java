/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;

/**
 *
 * @author danis
 */
public class Lab1 {

    public static void main(String args[]) {
Lab1 lab1 = new Lab1();
lab1.compulsory();
 }
 void compulsory() {
     System.out.println("Hello World!");
        String languages[]={"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
          int n = (int) (Math.random() * 1_000_000);
          int result= n*3;
          result=result+0b10101;
          result=result+0xFF;
          result=result*6;
          while(result>9)
          {
              int sum=0;
              int copie=result;
              while(copie>0)
              {
                  sum=sum+copie%10;
                  copie=copie/10;
              }
              result=sum;        
          }
          System.out.println("Willy-nilly,this semester i will learn "+languages[result]);
 }
         
}
