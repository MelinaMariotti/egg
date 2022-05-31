/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejheladofreddo;

import java.util.Scanner;

/**
 *
 * @author melim
 */
public class EjHeladoFreddo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        final Scanner input = new Scanner(System.in);
        
        char tamaño;
		int  cantGusto = 0;
		String nombre;
		String nombreGusto;
		double calorias = 0;
		int contTamañoGrande = 0;
		int contTamañoMediano = 0;
		int contTamañoChico = 0;
		
		
		do {
		System.out.println("Ingrese tamaño del helado sabiendo que \"C\" es chico, \"M\" es mediano, \"G\" es grande");
		tamaño = input.next().toUpperCase().charAt(0);
		switch (tamaño) {
		case 'C':
			System.out.println("Elijio tamaño chico");
			System.out.println("El valor es $250 mas $50 de comision de heladero ");
			do {
				System.out.println("Cantidad de gustos, maximo 4");
				cantGusto = input.nextInt();
			}while(cantGusto <0 || cantGusto >4);
			for (int i = 0; i < cantGusto; i ++) {
				System.out.println("Nombre del gusto");
				nombreGusto = input.nextLine();
			}
			contTamañoChico += 1;
			System.out.println("Ingrese su nombre");
			nombre = input.nextLine();
			break;
		case 'M':
			System.out.println("Elijio tamaño mediano");
			System.out.println("El valor es $300 mas $50 de comision de heladero ");
			do {
				System.out.println("Cantidad de gustos, maximo 4");
				cantGusto = input.nextInt();
			}while(cantGusto <0 || cantGusto >4);
			for (int i = 0; i < cantGusto; i ++) {
				System.out.println("Nombre del gusto");
				nombreGusto = input.nextLine();
			}
			contTamañoMediano += 1;
			System.out.println("Ingrese su nombre");
			nombre = input.nextLine();
			break;
		case 'G':
			System.out.println("Elijio tamaño grande");
			System.out.println("El valor es $400 mas $50 de comision de heladero ");
			do {
				System.out.println("Cantidad de gustos, maximo 4");
				cantGusto = input.nextInt();
			}while(cantGusto <0 || cantGusto >4);
			for (int i = 0; i < cantGusto; i ++) {
				System.out.println("Nombre del gusto");
				nombreGusto = input.nextLine();
			}
			contTamañoGrande += 1;
			System.out.println("Ingrese su nombre");
			nombre = input.nextLine();
			break;
		case 'Z':
			System.out.println("Fin de datos");
			break;
		default:
			System.out.println("No ingresaste una opcion valida");
			break;
		}
		
		}while (contTamañoGrande >20 || tamaño != 'Z');
		
        
        
        
        
        
        
        
        
        
    }
    
}
