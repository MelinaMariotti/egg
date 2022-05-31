/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Circunferencia;
import static java.lang.Math.PI;
import java.util.Scanner;

/**
 *
 * @author melim
 */
public class ServiciosCircunferencia {
    /*CONSTRUCTOR VACIO DE ESTA CLASE*/
    public ServiciosCircunferencia(){
    }
    
    /*METODO PARA CREAR CIRCUNFERCIAS*/
    public Circunferencia crearCircunferencia() {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        //instanciacion del obj de la clase -> Circunferencia
        //xq justamente en este metodo se tiene que crear una
        Circunferencia circun = new Circunferencia();
        
        System.out.println("Ingrese el radio de la circunferencia:");
        //con set para que lo establezca
        circun.setRadio(input.nextDouble());
                
        return circun;
    } // FIN METODO crearCircunferencia()
    
    
    /*METODO PARA CALCULAR EL AREA*/
    //es como si estuvieramos declarando una variable
    //es lo mismo poner como parametro "Circunferencia circun" que "Circunferencia c"
    //pero no necesariamente vamos a usar esa circun que se creo en el metodo anterior
    public void area(Circunferencia c){
        System.out.println("Su area es: " + PI*Math.pow(c.getRadio(), 2)); 
    } //FIN METODO AREA
    
    /*MEOTOD PARA CALCULAR EL PERIMETRO*/
    public void perimetro(Circunferencia c){
        System.out.println("Su perimetro es: " + (2*PI*c.getRadio()));
    }
    
    
}
