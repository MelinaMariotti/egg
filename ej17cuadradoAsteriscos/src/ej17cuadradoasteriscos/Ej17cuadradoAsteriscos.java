/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej17cuadradoasteriscos;

import java.util.Scanner;

/**
 *
 * @author melim
 */
public class Ej17cuadradoAsteriscos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 /*Ej 17 Bucles y sentencias de salto break y continue
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:*/       
        
        Scanner input = new Scanner(System.in);
 
        //decl de variables
        int squareSize;
        
        do {
            System.out.println("Elija el tamaño de los lados del cuadrado:");
            squareSize = input.nextInt();
        } while (squareSize < 0);

        //estructura para para que haga el cudrado x filas y columnas
        
        //LIENEA SUPERIOR
        for (int i = 0; i < squareSize; i++) {
            System.out.print("*"); //SIN SALTO DE LINEA           
        }
        
        //SALTO DE LINEA
        System.out.println("");
        
        //CENTRO DEL CUADRADO
        for (int i = 0; i < (squareSize-2); i++) {
            //parte derechea
            System.out.print("*"); //SIN SALTO DE LINEA
            //centro hueco
            for (int j = 0; j < (squareSize-2); j++) {
                System.out.print(" "); //SIN SALTO DE LINEA
            }
            System.out.println("*");
        }
        
        //LIENEA INFERIOR
        for (int i = 0; i < squareSize; i++) {
            System.out.print("*");            
        }
        
        
        
        
        
        
        
    }
    
}
