/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej09fraseconlenght8;

import java.util.Scanner;


/**
 *
 * @author melim
 */
public class Ej09FraseConLenght8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*Realizar un programa que solo permita introducir solo frases o palabras de 8 de
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.*/        
        
        Scanner leer = new Scanner(System.in);
        
        //decl variable
        String frase ;
        
        System.out.println("Ingrese una frase/palabra de 8 caracteres:");
        frase = leer.nextLine();
        
        //condicional
        if (frase.length() == 8) {
            System.out.println("CORRECTO! Se ingresaron 8 carcteres");
        } else {
            System.out.println("INCORRECTO. Se ingresaron " + frase.length()+" caracteres.");
        }
        
        
        
    }
    
}
