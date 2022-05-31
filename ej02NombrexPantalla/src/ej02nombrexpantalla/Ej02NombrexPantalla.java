/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej02nombrexpantalla;

import java.util.Scanner;

/**
 *
 * @author melim
 */
public class Ej02NombrexPantalla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //create varible to be able to read
        Scanner leer = new Scanner(System.in);
        
        String name;
        
        //output for reading name
        System.out.println("Type your name:");
        
        name = leer.next();
        
        //screen print of answer
        System.out.println("Hi! " + name);
    }
    
}
