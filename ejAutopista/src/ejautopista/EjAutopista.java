/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejautopista;

import java.util.Scanner;

/**
 *
 * @author melim
 */
public class EjAutopista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Scanner leer = new Scanner(System.in);  
        
      int cantAutopistas, numAutopista, cantCabinas, numCabina, turno, dineroXcabina, sumaTotalDeCabinas;
      
      //inicializacion variables
      cantAutopistas = 1;
      sumaTotalDeCabinas = 0;
      
        do {
          System.out.println("Ingrese la cantidad de autopistas:");
          System.out.println("Si ingresa 0 termina el programa");
          do {
             cantAutopistas = leer.nextInt();  
            } while (cantAutopistas <0);
          
          //bucle que analiza los casos para los 3 turnos invidual y secuencialemente
          for (int y = 0; y < 3; y++) {
               //bucle "For/Para" para que analice los datos x c/autopista 
               for (int i = 0; i < cantAutopistas; i++) {
                  System.out.println("Ingrese la cantidad de cabinas que tiene la autopista: "+(i+1)); //porque i es el contador de vueltas x c/autop
             
                  //bucle con la condicion que se repita si la cantCabinas es negaitvo (logicamente invalido) 
               do {
                  cantCabinas = leer.nextInt();  
               } while (cantCabinas < 0); //la consigna dice que cantCaibas > 0 (al menos 1 tiene)
  
               for (int j = 0; j < cantCabinas; j++) {
                  System.out.println("Dinero recaudado de la cabina "+(j+1)+" del turno "); 
                   do {
                     dineroXcabina = leer.nextInt();
                   } while (dineroXcabina < 0);
                  //calculo de suma de todas las cabinas x cada turno que se imprime cuando termine el bucle del turno
                  sumaTotalDeCabinas += dineroXcabina;
               }
               
               //impresion x pantalla de 
               } //final for cantAutopistas
          
            } //final for x c/turnos
          
          
              
            
        
          
        } while (numAutopista != 0); //final do principal que break el program cuando = condicion
          
      
        
        
      
      
    }
    
}
