/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author melim
 */
public class ServiciosCuentaBancaria {

    //CONSTRUCTOR VACIO
    public ServiciosCuentaBancaria() {
    }
    
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    /*METODO PARA CREAR UNA CUENTA BANCARIA*/
    public CuentaBancaria crearCuenta(){
        //creacion del objeto xq eso es lo que hace el metodo
        CuentaBancaria cuenta = new CuentaBancaria();
        
        System.out.println("Ingrese su numero de cuenta");
        cuenta.setNumeroCuenta(input.nextInt());
        System.out.println("Ingrese el DNI del cliente");
        cuenta.setDNI(input.nextInt());
        System.out.println("Ingrese su sueldo actual");
        cuenta.setSaldoActual(input.nextInt());

        return cuenta;
    } //FIN METODO CREAR CUENTA
    
    /*METODO PARA INGRESAR DINERO*/
    public void ingresarDinero(CuentaBancaria cuenta){
        System.out.println("Ingrese cuanto dinero gano");        
        double ingreso;
        ingreso = input.nextInt();
        
        //calculo para sumar el ingreso al saldo actual
        cuenta.setSaldoActual(ingreso + cuenta.getSaldoActual());
        
        System.out.println("Su saldo actual ahora es: " + cuenta.getSaldoActual());
    } //FIN METODO INGRESAR DINERO
    
    /*METODO PARA RETIRAR DINERO*/
    public void retirarDinero(CuentaBancaria cuenta){
        System.out.println("Ingrese cuanto dinero quiere retirar de su cuenta");
        double retiro;        
        do {                       
            retiro = input.nextInt();            
            if (retiro < 0) {
                System.out.println("ERROR! La cantidad de dinero debe ser positiva.");
            }
        } while (retiro < 0);
        
        //cuenta para restar el dinero a extraer al saldo actual
        cuenta.setSaldoActual(cuenta.getSaldoActual() - retiro);
        
        if (retiro > cuenta.getSaldoActual()) {
            System.out.println("Esta retirando mas dinero de lo que su cuenta posee");
            cuenta.setSaldoActual(0); //si la cuenta !tiene la cant. de dinero a retirar, el saldo actual sera 0
        } else if (retiro > 0 && retiro < cuenta.getSaldoActual()){
            System.out.println("Su saldo actual ahora es: " + cuenta.getSaldoActual());
        }
        
    } //FIN METODO INGRESAR DINERO
    
    
    /*METODO EXTRACCION RAPIDA*/
    public void extraccionRapida(CuentaBancaria cuenta){
      double veintePorciento = cuenta.getSaldoActual() * 0.20;
        System.out.println("Ingrese el monto para realizar una extraccion rapida (menor al 20% de su saldo)");
        double montoExtraccionRapida;
      //condicion para validar que el dinero sea positivo
      do {                       
            montoExtraccionRapida = input.nextInt();
            if (montoExtraccionRapida < 0) {
                System.out.println("ERROR! La cantidad de dinero debe ser positiva.");
            }
        } while (montoExtraccionRapida < 0);
        
        //cuenta para restar el dinero d la extraccion rapida al saldo actual
        cuenta.setSaldoActual(cuenta.getSaldoActual() - montoExtraccionRapida);
        
        if (montoExtraccionRapida > veintePorciento) {
            System.out.println("ERROR! No puede extraer mas del 20% de su saldo");
        } else { 
            System.out.println("Ahora su saldo es de: " + cuenta.getSaldoActual());
        } //FIN IF ... else
     
    } //FIN METODO EXTRACCION RAPIDA
    
    /*METODO CONSULTAR SALDO*/
    public void consultarSaldo(CuentaBancaria cuenta){
        System.out.println("Su saldo actual es: " + cuenta.getSaldoActual());
    }//FIN METODO CONSULTAR SALDO
    
    /*METODO CONSULTAR DATOS*/
    public void consultarDatos(CuentaBancaria cuenta){
        System.out.println("Sus datos son:");
        System.out.println("Numero de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("DNI: " + cuenta.getDNI());
        System.out.println("Saldo actual: " + cuenta.getSaldoActual());
    }//FIN METODO CONSULTAR DATOS
    
    
}//FIN CLASE SERVICIOS CUENTA BANCARIA
