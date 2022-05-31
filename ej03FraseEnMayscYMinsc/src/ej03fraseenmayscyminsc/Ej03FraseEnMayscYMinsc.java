/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej03fraseenmayscyminsc;

import java.util.Scanner;

/**
 *
 * @author melim
 */
public class Ej03FraseEnMayscYMinsc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        //declaracion varaible frase
        String frase;
        
        System.out.println("Ingrese una frase:");
        frase = leer.nextLine();
        
        //impresion de resultado con funcion toUpper/lowerCase
        System.out.println("El resultado es:");
        //upperCase
        System.out.println(frase.toUpperCase());
        //lowerCase
        System.out.println(frase.toLowerCase());
    }
    
}
