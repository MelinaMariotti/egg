/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej14sumar20numhastael0;

import java.util.Scanner;

/**
 *
 * @author melim
 */
public class Ej14Sumar20NumHastaEl0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 /*Ej 14 Bucles y sentencias de salto break y continue 
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.*/       
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("El programa permite ingresar hasta 20 numeros");
        int numero, suma;
        
        //inicializacion variable
        suma = 0 ;
        
        //bluce para introducir los 20 numero hasta input = 0
        for (int i = 0; i < 20; i++) {
            System.out.println("Ingrese un numero:");
            numero = leer.nextInt();
            if (numero > 0) {
            suma += numero ;   
            } else if (numero == 0) {
                System.out.println("Se capturo el numero 0");
                System.out.println("Se termina el programa.");
               break; 
            }
  
        }
        
        //impresion de resultado
        System.out.println("La suma de los numeros positivos ingresados es: "+suma);
    }
    
}
