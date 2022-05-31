/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author melim
 */
public class ServiciosCafetera {

    //CONSTRUCTOR VACIO
    public ServiciosCafetera() {
    }
    
    Scanner input = new Scanner(System.in);
    
    /*METODO CREAR CAFETERA*/
    public Cafetera crearCafetera(){
        //creacion del objeto
        Cafetera cafetera = new Cafetera();
        
        System.out.println("Ingrese la capacidad maxima de la cafetera");
        do {
            cafetera.setCapacidadMaxima(input.nextInt());
            if (cafetera.getCapacidadMaxima() < 0) {
                System.out.println("ERROR! Valor invalido");
            } //validacion input
        } while (cafetera.getCapacidadMaxima() < 0); //loop hasta que ingrese correctamente
        
        System.out.println("Ingrese la cantidad actual de cafe que tiene la cafetera");
        do {
            cafetera.setCantidadActual(input.nextInt());
            if (cafetera.getCantidadActual() < 0) {
                System.out.println("ERROR. Valor invalido");
            } else if(cafetera.getCantidadActual() > cafetera.getCapacidadMaxima()){
                System.out.println("ERROR! No puede almacenar mas de su capacidad maxima");
            }//validacion de input
        //si es menor a 0 o si la cant. actual es mayor a la capacidad maxima "se desborda"    
        } while (cafetera.getCantidadActual()< 0 || cafetera.getCantidadActual() > cafetera.getCapacidadMaxima()); //loop hasta que ingrese correctamente
        
        return cafetera;
    }//FIN METODO CREAR CAFETERA
    
    
    /*METODO LLENAR CAFETERA*/
    public void llenarCafetera(Cafetera cafetera){
        //a la cafetera le seteamos el tope/capacidad maxima de la misma
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        System.out.println("Su cafetera esta llena. Tiene " + cafetera.getCapacidadMaxima() + " unidades");
    } //FIN METODO LLENAR CAFETERA
    
    /*METODO ServirTaza*/
    public void servirTaza(Cafetera cafetera){
        int tamanyoTaza;
        
        System.out.println("Ingrese el tamanyo/capacidad de su taza");
        do {
            tamanyoTaza = input.nextInt();
            
            if (tamanyoTaza > 0 && tamanyoTaza <= cafetera.getCantidadActual()) {
                System.out.println("Su taza esta llena");
            } else if ((tamanyoTaza > cafetera.getCantidadActual() && tamanyoTaza < cafetera.getCapacidadMaxima()) && cafetera.getCantidadActual() > 0) { //x lo menos algo que cafe tiene la cafetera
                //"no alcanza el cafe para llenar la taza"
                System.out.println("No alcanza para llenar completamente la taza");
                System.out.println("Solo se pudo llenar " + cafetera.getCantidadActual() + " unidades");
            } else if (cafetera.getCantidadActual() == 0){
                System.out.println("No hay cafe para llenar en la taza");
            }//fin condicion y validacion
        } while (tamanyoTaza < 0 || tamanyoTaza > cafetera.getCapacidadMaxima());
        
    }//FIN METODO ServirTaza
    
    /*METODO VACIAR CAFETERA*/
    public void vaciarCafetera(Cafetera cafetera){
        cafetera.setCantidadActual(0); //se setera en 0, se vacia
    }//FIN METODO VACIAR CAFETERA
    
    /*METODO AGREGAR CAFE*/
    public void agregarCafe(Cafetera cafetera){
        int cafeAgregado;
        int disponible;
        
        //calculo del cafe que queda disponible PARA agregar
        disponible = cafetera.getCapacidadMaxima() - cafetera.getCantidadActual();
        
        System.out.println("Ingrese cuando cafe quiere agregar a la cafetera");
        do {         
            cafeAgregado = input.nextInt();
            if (cafeAgregado > 0 && cafeAgregado <= disponible){  
                System.out.println("El cafe fue agregado.");
                //calculo del cafe agregado a la cantidad actual
                cafetera.setCantidadActual(cafeAgregado + cafetera.getCantidadActual());
                System.out.println("La cantidad actual es de: " + cafetera.getCantidadActual());
            }else if (cafeAgregado > cafetera.getCapacidadMaxima()) {
                System.out.println("ERROR! No se puede agregar mas de lo que permite su capacidad maxima");          
            } else if (cafeAgregado < 0 ) {
                System.out.println("ERROR! Valor invalido");
            } else if (cafeAgregado == 0) {
                System.out.println("No se agrego cafe");
            }//FIN IF ... else 
                         
        } while (cafeAgregado < 0 || cafeAgregado > cafetera.getCapacidadMaxima()); //se le quiera agrgar mas de su capacidad        
        
    }//FIN METODO AGREGAR CAFE
    
    
} //FIN CLASE SERVICIOS CAFETRA
