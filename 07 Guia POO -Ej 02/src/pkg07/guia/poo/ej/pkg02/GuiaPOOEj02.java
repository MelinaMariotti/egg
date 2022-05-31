/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07.guia.poo.ej.pkg02;

import Entidades.Circunferencia;
import Servicios.ServiciosCircunferencia;

/**
 *
 * @author melim
 */
public class GuiaPOOEj02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
del objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).*/        
        
        /*CREACION DE SERVICIO OBJ*/
        /*para llamar a los metodos que usa ese obj*/
        ServiciosCircunferencia sc = new ServiciosCircunferencia();
        
        /*Se crea un obj de la clase -> Circunferencia*/
        Circunferencia circunferencia1 = sc.crearCircunferencia();
        /*INVOCACION DE METODOS*/
        sc.area(circunferencia1);
        sc.perimetro(circunferencia1);
        
    }
    
}
