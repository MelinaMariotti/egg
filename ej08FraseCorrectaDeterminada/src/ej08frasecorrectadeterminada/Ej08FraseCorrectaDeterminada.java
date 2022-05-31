/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej08frasecorrectadeterminada;

import java.util.Scanner;

/**
 *
 * @author melim
 */
public class Ej08FraseCorrectaDeterminada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.*/


        Scanner leer = new Scanner(System.in);
    
        //decl variable String
         String frase;
    
        System.out.println("Ingrese una frase:");
        frase = leer.nextLine();
        
        //condicional
        if (frase.equals("eureka")) {
            System.out.println("CORRECTO! la frase coincide con \"eureka\"");
        } else {
            System.out.println("INCORRECTO! Las frases no coinciden.");
        }
        
        


    }
    
}
