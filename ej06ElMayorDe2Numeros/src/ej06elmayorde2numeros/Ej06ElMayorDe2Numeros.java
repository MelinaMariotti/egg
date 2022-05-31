/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej06elmayorde2numeros;

import java.util.Scanner;

/**
 *
 * @author melim
 */
public class Ej06ElMayorDe2Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
/*Implementar un programa que dado dos números enteros determine cuál es el
mayor y lo muestre por pantalla.*/        

        Scanner leer = new Scanner(System.in);
        
        //decl variables numericas
        int num1, num2 ;
        
        System.out.println("Ingrese un numero entero:");
        num1 = leer.nextInt();
        System.out.println("Ingrese otro numero entro");
        num2 = leer.nextInt();
        if (num1 == num2) {
            System.out.println("Los numeros son iguales.");
        } else if (num2 > num1) {
            System.out.println("Entre "+num1+" y "+num2+" el mayor es: "+ num2);
        } else{
            System.out.println("Entre "+num1+" y "+num2+" el mayor es: "+ num1);
        }

     
        
    }
    
}
