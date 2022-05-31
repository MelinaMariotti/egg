/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej05numzx2x3yraizcuadrada;

import java.util.Scanner;

/**
 *
 * @author melim
 */
public class Ej05numZx2x3yRaizCuadrada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
 /*Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().*/       
        
        Scanner leer = new Scanner(System.in);
        
        //variable numerica
        int numeroZ, doble, triple ;
        double raizCuadrada ;
        
        System.out.println("Ingrese un numero entero:");
        numeroZ = leer.nextInt();
        
        doble = numeroZ * 2 ;
        triple = numeroZ * 3 ;
        raizCuadrada = Math.sqrt(numeroZ) ;
        
        //impresion de resultado x pantalla
        System.out.println("El doble de "+numeroZ+" es: "+doble);
        System.out.println("El triple de "+numeroZ+" es: "+triple);
        System.out.println("La raiz cuadrada de "+numeroZ+" es: "+raizCuadrada);
 
    }
    
}
