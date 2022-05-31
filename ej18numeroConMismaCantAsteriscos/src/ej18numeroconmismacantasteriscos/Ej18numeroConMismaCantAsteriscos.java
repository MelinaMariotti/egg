/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej18numeroconmismacantasteriscos;

import java.util.Scanner;

/**
 *
 * @author melim
 */
public class Ej18numeroConMismaCantAsteriscos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*Ej 18 Bucles y sentencias de salto break y continue
 Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **       */        
        Scanner input = new Scanner(System.in);
        
        //decl variables
        int num;
        
        System.out.println("El programa le pedira ingresar 4 numeros que esten entre el 1 y 20");
        //buc;e para igresar los 4 numeros
        for (int i = 0; i < 4; i++) {
            do {
                System.out.println("Ingrese un numero:");
                num = input.nextInt();            
        } while (num<1 || num > 20);
            System.out.print(num+" ");
            for (int j = 0; j < num; j++) {
                //repeticion de asteriscos
                System.out.print("*"); //SIN "ln" SALTO DE LINEA
                
            }
        System.out.println("");    
        }
        
        
    }
    
}
