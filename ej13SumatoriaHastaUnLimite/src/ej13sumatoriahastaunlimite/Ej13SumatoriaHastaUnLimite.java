/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej13sumatoriahastaunlimite;

import java.util.Scanner;

/**
 *
 * @author melim
 */
public class Ej13SumatoriaHastaUnLimite {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
 /*Ej 13 Bucles y sentencias de salto break y continue: 
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial.*/       
        
        Scanner leer = new Scanner(System.in);
        
        //declaracion de variables numericas
        int limitePositivo, numero, suma;
        
        do {
            System.out.println("Establezca un numero positivo como limite:");
            limitePositivo = leer.nextInt();
        } while (limitePositivo<0);
        
        //inicializacion variable
        suma = 0;
        
        while (suma <= limitePositivo) {            
            System.out.println("Ingrese un numero para la suma:"); 
            numero = leer.nextInt();
            suma += numero;
        }
   
        //impresion de resultado
        System.out.println("La suma supero el limite establecido! ("+limitePositivo+")");
        System.out.println("Suma = "+ suma);
        
        
    }
    
}
