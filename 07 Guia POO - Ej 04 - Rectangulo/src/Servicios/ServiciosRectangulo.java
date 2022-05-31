/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author melim
 */
public class ServiciosRectangulo {

    //CONSTRUCTOR VACIO
    public ServiciosRectangulo() {
    }
    
    //METODO PARA CREAR RECTANGULO
    public Rectangulo crearRectangulo(){
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        Rectangulo rectan = new Rectangulo();
        
        System.out.println("Ingrese el tamanyo de la base");
        rectan.setBase(input.nextInt());
        System.out.println("Ingrese el tamanyo de la altura");
        rectan.setAltura(input.nextInt());
        
        return rectan;
    } //FIN METODO DE CREACION
    
    /*METODO PARA CALCULAR SUPERFICIE DE UN RECTANGULO*/
    public void superficieRectangulo(Rectangulo rectan){        
        System.out.println("Multiplicando su base por su altura, su superficie es: " + (rectan.getBase()*rectan.getAltura()));
    } //FIN  METODO CALCULO DE SUPERFICIE
    
    /*METODO PARA CALCULAR EL PERIMETRO*/
    public void perimetroRectangulo(Rectangulo rectan){
        System.out.println("Sumando sus 4 lados, su perimetro es: " + (rectan.getBase()+rectan.getAltura())*2);
    } //FIN METODO CALCULO PERIMETRO
    
    /*METODO PARA DIBUJAR RECTANGULO RELLENO*/
    //utilizando un bucle for
    //xq en c/fila va poner * por c/columna como indique el tamanyo de la base/ancho
    public void dibujoRectanguloRelleno(Rectangulo rectan){
        for (int fila = 0; fila < rectan.getAltura(); fila++) {
            for (int columna = 0; columna < rectan.getBase(); columna++) { //la col aumenta de 1 en 1 al final de c/pasada              
                System.out.print("*"); //SIN EL "LN" DEL PRINT, sin saltar linea
            }
            System.out.println("");//CON EL "LN" PARA SALTAR LA LINEA
            
        }
    } //FIN METODO DIBUJO RECTANGULO RELLENO
    
    /*METODO PARA DIBUJAR RECTANGULO VACIO*/
    //utilizando un bucle for anidado
    public void dibujoRectanguloVacio(Rectangulo rectan){
        for (int fila = 0; fila < rectan.getAltura(); fila++) {
            for (int columna = 0; columna < rectan.getBase(); columna++) { //la col aumenta de 1 en 1 al final de c/pasada              
                //en esta caso se puede usar un if para comprobar si:
                //estas posicionado en la 1era fila o el la ultima fila (que coincide con el alto)
                //O en la 1er o ultima columna (q coincide con el ancho)
                //para que se visualice la linea completa de (*) para las bases y "paredes" (los 4 lados)
                if (
                    ((fila == 0) || (fila == rectan.getAltura()))
                    || ((columna == 0) || (columna == rectan.getBase()))
                   )/*fin condicion*/ {
                    //genera la la linea completa de asteriscos
                    System.out.print("*"); //SIN EL "LN" DEL PRINT, sin saltar linea
                } else { //si esta en la parte vacia que ponga espacios en blanco
                    System.out.print(" ");
                }
            } //fin 2do for
            //pensarlo como un salto de linea, un <ENTER>
            System.out.println("");//CON EL "LN" PARA SALTAR LA LINEA
            
        }//fin del 1er for
    } //FIN METODO DIBUJO DE RECTANGULO VACIO
    
    
    
} //FIN CLASE SERVICIOSRECTANGULO
