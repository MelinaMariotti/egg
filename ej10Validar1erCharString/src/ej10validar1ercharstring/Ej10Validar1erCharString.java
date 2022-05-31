/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej10validar1ercharstring;

import java.util.Scanner;

/**
 *
 * @author melim
 */
public class Ej10Validar1erCharString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.*/       
        
       Scanner leer = new Scanner(System.in);
       
       //decl variable String
       String frase, validarCaracter;
       
        System.out.println("Ingrese una frase o palabra que empiece con \'A\':");
        frase = leer.nextLine();
        
        //metodo para que valide el 1er caracter de la frase
        validarCaracter = frase.substring(0,1);
        
        //condicional
        if (validarCaracter.equals("A") || validarCaracter.equals("a")){
            System.out.println("CORRECTO!");
        } else {
            System.out.println("INCORRECTO");
        }
        

        
    
    }
}
