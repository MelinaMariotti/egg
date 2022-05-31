/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej04centigradosafrahrenheit;

import java.util.Scanner;

/**
 *
 * @author melim
 */
public class Ej04CentigradosAFrahrenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
 /* Dada una cantidad de grados centígrados se debe mostrar su equivalente en
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
        
        Scanner leer = new Scanner(System.in);
        
        //variable de gradosC y gradosF
        double gradosC, gradosF ;
        
        System.out.println("Ingrese la cantidad de grados centigrados:");
        gradosC = leer.nextDouble();
        
        //calculo de gradosC a gradosF
        gradosF = 32 + (9 * gradosC / 5) ;
        
        //impresion de resultado
        System.out.println(gradosC + "°C equivale a " + gradosF + "°F");
        
    }
    
}
