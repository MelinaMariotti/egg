/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej15menuopearitmeticas;

import java.util.Scanner;

/**
 *
 * @author melim
 */
public class Ej15MenuOpeAritmeticas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*Ej 15 Bucles y sentencias de salto break y continue 
Realiazr un programa con este menu:
MENU 1. Sumar 2. Restar 3. Multiplicar 4. Dividir 5. Salir - Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.*/        
        
        Scanner leer = new Scanner(System.in);
        
        //decl variables numericas
        int num1, num2, opcionMenu ;
        //declaracion de variables para las operaciones
        int suma, resta, multiplicacion;
        double division ;
        //declaracion char para opcionSalida
        char opcionSalida = 0 ; //xq devuelve int
        
        //output consigna
        System.out.println("MENU PARA REALIZAR OP. ARITMETICAS ENTRE 2 NUMEROS Z+");
        //bucle para que ingrese unicamente Z+
        do {
            System.out.println("Ingrese el 1er numero:");  
            num1 = leer.nextInt();
            System.out.println("Ingrese el 2do numero:");
            num2 = leer.nextInt();
        } while (num1<0 && num2<0);
        
        
        //bucle que se muestra que este este seguro de salir del programa con el menu secundario
        do {
            System.out.println("MENU: 1.Sumar / 2.Restar / 3.Multiplicar / 4.Dividir / 5.Salir");
            System.out.println("Elija una opcion segun el numero:");
            do {
              opcionMenu = leer.nextInt();
              
              //mensaje de error x si elije numero invalido
                if (opcionMenu<1 || opcionMenu>5) {
                    System.out.println("ERORR! Ingrese un numero valido.");
                }
            } while (opcionMenu<1 || opcionMenu>5);
            
            //MENU PRINCIPAL
            switch (opcionMenu){
                case 1:
                    suma = num1 + num2;
                    System.out.println("La suma entre "+num1+" y "+num2+" = "+suma);
                break;
                case 2:
                    resta = num1 - num2;
                    System.out.println("La resta entre "+num1+" y "+num2+" = "+resta);
                break;
                case 3:
                    multiplicacion = num1 * num2;
                    System.out.println("La multiplicacion entre "+num1+" y "+num2+" = "+multiplicacion);
                break;
                case 4:
                    division = num1 / num2;
                    System.out.println("La division entre "+num1+" y "+num2+" = "+division);
                break;
                case 5:
                    System.out.println("¿Esta seguro que desea salir del programa? (S/N)");
                  opcionSalida = leer.next().charAt(0);
                  if (Character.compare(opcionSalida,'s') == 0){
                      System.out.println("Usted ha salido del programa");
                      break;
                  } //END IF, finalizacion del programa
            } //FIN DEL MENU CALCULADORA
            
        } while (Character.compare(opcionSalida,'s') != 0);
        
        
        
        
    }
    
}
