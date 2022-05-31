/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07.guia.poo.ej.pkg04.rectangulo;

import Entidades.Rectangulo;
import Servicios.ServiciosRectangulo;

/**
 *
 * @author melim
 */
public class GuiaPOOEj04Rectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/* GUIA 7 POO - EJERCICIO 4
Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para crear el
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
método para calcular la superficie del rectángulo y un método para calcular el
perímetro del rectángulo. Por último, tendremos un método que dibujará el
rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.*/        
        
        // TODO code application logic here
        
        ServiciosRectangulo objServicioRectangulo = new ServiciosRectangulo();
        
        
        //con el objeto rectan se crea a traves de los servicios del mismo
        Rectangulo rectan = objServicioRectangulo.crearRectangulo();
        
        //invocacion de metodos void
        objServicioRectangulo.superficieRectangulo(rectan);
        objServicioRectangulo.perimetroRectangulo(rectan);
        System.out.println("");
        System.out.println("El dibujo del rectangulo relleno es:");
        objServicioRectangulo.dibujoRectanguloRelleno(rectan);
        System.out.println("El dibujo del rectangulo vacio es:");
        objServicioRectangulo.dibujoRectanguloVacio(rectan);
        
        
        
    }
    
}
