/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej19conversiondemoneda;

import java.util.Scanner;

/**
 *
 * @author melim
 */
public class Ej19conversionDeMoneda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*Ej 19 Vectores y Matrices en Java 
Crea una aplicación que a través de una función nos convierta una cantidad de
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
converir que será una cadena, este no devolverá ningún valor y mostrará un
mensaje indicando el cambio (void).
El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 € */
        Scanner input = new Scanner(System.in);
        
        //decl variables
        double euro;
        System.out.println("");
    } //FIN DEL MAIN
    
    //FUNCION
    //static hace que no tenga que ser intanciado mediante un objeto, se encuentra estatico en la memoria
    public static void conversion(double euro){
        System.out.println(euro+" euros equivalen a "+euro*0.86+" libras");
        System.out.println(euro+" euros equivalen a "+euro*1.28611+" dolares");
        System.out.println(euro+" euros equivalen a "+euro*129.852+" yenes");
        //delc variables
        
   
    } 
    
}
