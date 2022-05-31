/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author melim
 */


/*EN ESTA VA TODOS LOS FUNCIONAMIENTOS DEL PROGRAMA*/

public class ServiciosLibro {
    /*CONSTRUCTOR VACIO DE ESTA CKASE*/
    public ServiciosLibro() {
    }
    
    
    
    /*METODO PARA CREAR LIBRO*/
    //en vez de <public void crearLibro()> se pone <public LIBRO ...> 
    //para que devuelva el obj con el <return ls;> del final 
    public Libro crearLibro(){
        
        Scanner input = new Scanner (System.in).useDelimiter("\n");
    
        //instanciacion del objeto de la clase -> Libro
        Libro ls = new Libro();
        
        //se usan setters para que cuando el usaurio ingrese el valor para la variable
        //se guarden, se "setean"
        System.out.println("Ingrese el nombre del Autor:");
        ls.setAutor(input.next());
        
        System.out.println("Ingrese el titulo del libro:");
        ls.setTitulo(input.next());
        
        System.out.println("Ingrese el ISBN:");
        ls.setISBN(input.nextInt());
        
        System.out.println("Ingrese la cantidad de paginas que tiene el libro:");
        ls.setCantPaginas(input.nextInt());
        
        return ls;
        //para que devuelva el obj y ademas se puesa usarne el los metodos 
        //que necesitan de ese argumento para trabajar con ese mismo
    }
    
    /*METODO PARA MOSTRAR EL LIBRO*/
    /*se usa void xq muestran la rta los sout y no hace falta que retorne nada*/
    public void mostrarLibro(Libro ls){
        /*SE USA GETTER PARA OBTENER EL VALOR Y MOSTRARLO CON SOUT*/
        System.out.println("El nombre del autor es: " + ls.getAutor());
        System.out.println("El titulo del libro es: " + ls.getTitulo());
        System.out.println("El ISBN es: " + ls.getISBN());
        System.out.println("La cantidad de paginas del libro son: " + ls.getCantPaginas());
    }
    
    
} /*FIN SERVICIOS LIBRO*/
