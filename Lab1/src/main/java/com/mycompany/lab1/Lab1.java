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
        String[] languages={"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
          int n = (int) (Math.random() * 1_000_000);
          int result= n*3;
          String binar="10101";
          String hexadecimal="FF";
          int cifra1=Integer.parseInt(binar,2);
          int cifra2=Integer.parseInt(hexadecimal,16);
          result=result+cifra1+cifra2;
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
