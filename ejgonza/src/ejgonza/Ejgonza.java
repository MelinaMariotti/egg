/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejgonza;

import java.util.Scanner;

/**
 *
 * @author melim
 */
public class Ejgonza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        //decl variables numericas
        int numero;
        //decl varaibles booleanas
        boolean esDeUnSoloDigito, esImpar, estaEnAmbos, noEstaEnNinguno;
        
        System.out.println("Ingrese un valor:");
        numero = leer.nextInt();
        
        if (numero < 10 || numero > -10) {
           esDeUnSoloDigito = true; 
            System.out.println("Pertenece al conjunto A");
        }
        
        
        
        
        
        
    }
    
}
