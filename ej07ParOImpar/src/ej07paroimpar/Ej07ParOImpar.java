/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej07paroimpar;

import java.util.Scanner;

/**
 *
 * @author melim
 */
public class Ej07ParOImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 /*Crear un programa que dado un numero determine si es par o impar*/
 
       Scanner leer = new Scanner(System.in) ;
       
       //decl variable numerica Z
       int num;
       
       System.out.println("Ingrese un numero entero:");
       num = leer.nextInt();
       
       
        if (num % 2 == 0) {
            System.out.println(num + " es par");
        } else {
            System.out.println(num + " es impar.");
        }
 
    }
    
}
