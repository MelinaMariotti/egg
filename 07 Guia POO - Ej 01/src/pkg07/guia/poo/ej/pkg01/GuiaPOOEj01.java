/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07.guia.poo.ej.pkg01;

import Entidades.Libro;
import Servicios.ServiciosLibro;

/**
 *
 * @author melim
 */
public class GuiaPOOEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.*/        
        
        
        /*CREACION DE SERVICIO OBJ*/
        /*para llamar a los metodos que usa ese obj*/
        ServiciosLibro sl = new ServiciosLibro();
        
        /*l1 se crea en la clase -> ServicioLibro*/
        Libro l1 = sl.crearLibro();
        sl.mostrarLibro(l1);
    }
    
}
