
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author melim
 */
public class ej01suma2numZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
 /*Escribir un programa que pida dos números enteros por teclado y calcule la suma
 de los dos. El programa deberá después mostrar el resultado de la suma */
        
        Scanner leer = new Scanner(System.in) ;
        //declaracion de varaibles tipo Entero
        int num1, num2, sum ;
        
        System.out.println("Type a integer number:");
        //leer num1
        num1 = leer.nextInt() ;
        System.out.println("Type another integer number:");
        num2 = leer.nextInt();
        
        //calculo de suma entre num1 y num2
        sum = num1 + num2 ;
        System.out.println("The sum between " + num1 + " + " + num2 + " is: " + sum);
        
    }
    
}
