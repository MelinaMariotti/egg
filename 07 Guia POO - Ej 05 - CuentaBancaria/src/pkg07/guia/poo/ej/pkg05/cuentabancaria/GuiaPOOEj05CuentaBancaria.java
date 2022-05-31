/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07.guia.poo.ej.pkg05.cuentabancaria;

import Entidades.CuentaBancaria;
import Servicios.ServiciosCuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author melim
 */
public class GuiaPOOEj05CuentaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/* GUIA 7 POO EGG - EJERCICIO 5
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta.*/        
        
        // TODO code application logic here
        
        ServiciosCuentaBancaria servicioCuenta = new ServiciosCuentaBancaria();
        
        //invocacion del objeto de entidades
        CuentaBancaria cuenta = servicioCuenta.crearCuenta();
        
        Scanner input = new Scanner(System.in);
        //declaracion variable
        int opcion;                    

        
        do { //repite las opciones hasta que el usuario decida salir
            //OPCIONES MENU
            System.out.println("1. Ingresar dinero / 2. Retirar dinero / 3. Realizar una extraccion rapida /");
            System.out.println("4.Consultar saldo / 5.Consultar datos / 6.Salir");
            
            System.out.println("Ingrese el numero de la operacion que quiere realizar");
            //validacion
            do {
                opcion = input.nextInt();
            } while (opcion < 0 || opcion > 6);
            
            //MENU
            switch(opcion){
                case 1:
                    //invocacion del metodo
                    servicioCuenta.ingresarDinero(cuenta);
                break;
                case 2:
                    //invocacion del metodo
                    servicioCuenta.retirarDinero(cuenta);
                break;    
                case 3:
                    //invocacion del metodo
                    servicioCuenta.extraccionRapida(cuenta);
                break;
                case 4:
                    //invocacion del metodo
                    servicioCuenta.consultarSaldo(cuenta);
                break; 
                case 5:
                    //invocacion del metodo
                    servicioCuenta.consultarDatos(cuenta);
                break;
                case 6:
                    System.out.println("Usted eligio salir del programa. Hasta pronto!");
                break;                                                   
            } //FIN SWITCH
        } while (opcion != 6);                               
        
        
    } //FIN METODO MAIN
    
} //FIN CLASE
