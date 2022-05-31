/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07.guia.poo.ej.pkg06.nespresso;

import Entidades.Cafetera;
import Servicios.ServiciosCafetera;
import java.util.Scanner;

/**
 *
 * @author melim
 */
public class GuiaPOOEj06Nespresso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/* GUIA 7 POO EGG - EJERCICIO 6
Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.*/        

        // TODO code application logic here
        
        ServiciosCafetera servCafetera = new ServiciosCafetera();
        
        //invocacion para crear el obj cafetera
        Cafetera cafetera = servCafetera.crearCafetera();
        
        Scanner input = new Scanner(System.in);
        int opcionMenu;
        
        do {
            System.out.println("1.Llenar Cafetera / 2.Servir en taza / 3.Vaciar Cafetera /");
            System.out.println("4.Agregar cafe a la Cafetera / 5.Salir");
            System.out.println("Elija la opcion segun el numero");
            //validacion del numero de las opciones del menu
            do {
                opcionMenu = input.nextInt();
            } while (opcionMenu < 0 || opcionMenu > 5);
            
            
            //MENU
            switch (opcionMenu){
                case 1:
                    servCafetera.llenarCafetera(cafetera);
                break;    
                case 2:
                    servCafetera.servirTaza(cafetera);
                break;
                case 3:
                    servCafetera.vaciarCafetera(cafetera);
                break;
                case 4:
                    servCafetera.agregarCafe(cafetera);
                break;
                case 5:
                    System.out.println("Usted ha salidos del programa. Hasta luego!");
                break;                    
            } //FIN MENU SWITCH
            
        } while (opcionMenu != 5); //Salir del programa
        
        
        
    } //FIN METODO MAIN
    
} //FIN CLASE MAIN
