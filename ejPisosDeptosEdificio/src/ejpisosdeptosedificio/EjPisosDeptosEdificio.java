/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpisosdeptosedificio;

import java.util.Scanner;

/**
 *
 * @author melim
 */
public class EjPisosDeptosEdificio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        //declaracion variables
        int numPiso, numDepto;
        
        do {
            
            System.out.println("Ingrese numero de piso (0 para finalizar):");
            numPiso = leer.nextInt();
            
            //rango del piso 1 al 10
            if (numPiso>= 1 || numPiso <= 10) {
                do {
                    System.out.println("Ingrese el depto (1-4) del piso "+numPiso);
                    numDepto = leer.nextInt();
                } while (numDepto < 1 || numDepto > 4); //condicion para validar el rango correcto x piso
                System.out.println("Tiene mascota?");
            
            //rango del piso 11 al 20
            } else if (numPiso>= 11 || numPiso <= 20) {
                System.out.println("Ingrese el depto (1-3) del piso "+numPiso);
                do {
                    numDepto = leer.nextInt();
                } while (numDepto < 1 || numDepto > 3); //condicion para validar el rango correcto x piso
                System.out.println("Tiene mascota?");
                
            //rango del piso 21 a 30    
            } else if (numPiso >=21 || numPiso <=30) {
                do {
                    System.out.println("Ingrese el depto (1 o 2) del piso "+numPiso);
                    numDepto = leer.nextInt();
                } while (numDepto < 1 || numDepto > 2); //condicion para validar el rango correcto x piso
                System.out.println("Tiene mascota?");
            }
            
        } while (numPiso != 0); //condicion para que finalice el prog cuando numPiso = 0
        
        
        
        
        
        
        
        
    }
    
}
