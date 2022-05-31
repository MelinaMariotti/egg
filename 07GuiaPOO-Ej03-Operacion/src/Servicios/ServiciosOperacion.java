/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author melim
 */
public class ServiciosOperacion {
    
    /*CONSTRUCTOR VACIO DE ESTA CLASE*/
    public ServiciosOperacion() {
    }
    
    /*METODO PARA CREAR OPERACIONES*/
    public Operacion crearOperacion(){
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        //instanciacion del obj de la clase -> Operacion
        //xq justamente en este metodo se tiene que CREAR una
        Operacion operacion = new Operacion();
        
        System.out.println("Ingrese un numero:");
        operacion.setNumero1(input.nextInt());
        System.out.println("Ingrese otro numero:");
        operacion.setNumero2(input.nextInt());

        return operacion;
    } //FIN METODO crearOperacion()
    
    /*METODO SUMAR*/
    public void sumar(Operacion op){
        System.out.println("La suma entre los numeros es: " + (op.getNumero1()+ op.getNumero2()));
    } //FIN METODO SUMAR
    
    /*METODO PARA RESTAR*/
    public void restar(Operacion op){
        System.out.println("La resta entre los numeros es: " + (op.getNumero1() - op.getNumero2()));
    } //FIN METODO RESTAR
    
    public double multiplicar(Operacion op){
        double multiplicar;
        if (op.getNumero1() == 0 || op.getNumero2() == 0) {
            System.out.println("ERROR. No se puede multiplicar por 0");
            return 0;
        } else {
           multiplicar = op.getNumero1() * op.getNumero2();
        }
        return multiplicar;
    } //FIN METODO MULTIPLICAR
    
    public double dividir(Operacion op){
        double dividir;
        if (op.getNumero2() == 0) {
            System.out.println("ERROR. No se puede dividir por 0");
            return 0;
        } else {
            dividir = op.getNumero1() / op.getNumero2();
        }       
        return dividir;
    } //FIN MEOTODO DIVIDIR
     
    
    
} //FIN CLASE ServiciosOperacion
