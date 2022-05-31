/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpruebaatletismo;

import java.util.Scanner;

/**
 *
 * @author melim
 */
public class EjPruebaAtletismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        //decl variables numericas
        int minXdia, contMinMenosQue20, contAlMenos1PruebaMenos15, sumMinutosTotales, promedioMinutosTotales;
        
        //inicializacion de variables
        contMinMenosQue20 = 0;
        contAlMenos1PruebaMenos15 = 0;
        sumMinutosTotales = 0;
        promedioMinutosTotales = 1;
        
        //bucle for, para analizar c/dia de los 10 dias
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese los minutos recorridos del dia "+(i+1)); //i = contador de dias
            //bucle para validar que sean positivos y menor a 100
            do {
                minXdia = leer.nextInt();
            } while (minXdia<0 || minXdia>100);
            
        //condiciones para que se considere APTO
            if (minXdia < 20) {
                contMinMenosQue20 += 1; //contador de los dias que hizo - de 20 minutos           
            } else if (minXdia < 15) {
                contAlMenos1PruebaMenos15 += 1; //contador para los dias que hizo - 15
            } //final if analizador de minutos
            
            sumMinutosTotales += minXdia; //por c/dia (vuelta del bucle) va sumando los minutos totales recorridos
        } //final bucle x dia
 
        //calculo del promedio de minutos totales recorridos
        promedioMinutosTotales = sumMinutosTotales / 10 ; //dividio 10 dias
        System.out.println("Promedio: "+promedioMinutosTotales);
        
        //impresion x pantalla con validacion para que muestre si esta apto
        if (promedioMinutosTotales <= 18 && contMinMenosQue20 == 10 && contAlMenos1PruebaMenos15 > 0) {
           System.out.println("ESTA APTO!"); 
        }
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
