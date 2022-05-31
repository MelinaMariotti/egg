/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej16validacionspecialstring;

import java.util.Scanner;

/**
 *
 * @author melim
 */
public class Ej16ValidacionSpecialString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo
se utilizan las siguientes funciones de Java Substring(), Length(), equals().*/
        
        //objeto para leer inputs
        
        Scanner input = new Scanner(System.in);
        
        //declaracion variables
        String cadena;
        int correctInput = 0;
        int incorrectInput = 0; 
                
        do {
            do {
            System.out.println("Ingrese la cadena (max 5 char) que empiece con \'X\' y termine con \'O\':");
            System.out.println("O la cadena especial \'&&&&&\' que finaliza los envios");
            cadena = input.nextLine();
            } while (cadena.length() > 5);
            //validacion y contador del input de la cadena con las restricciones
            if (cadena.charAt(0) == 'X' && cadena.endsWith("O")) {
                correctInput += 1;
            //contador de veces que igresaron mal la cadena    
            } else if (cadena.equals("&&&&&")){
                correctInput += 1;
                System.out.println("FINALIZO EL PROGRAMA");
                break; //FINALIZA EL PROGRAMA
            } else if (cadena.charAt(0) != 'X' && !cadena.endsWith("O")){
                incorrectInput += 1;
            }
        } while (!cadena.equals("&&&&&"));
        
        //impresion de rta x pantalla
        System.out.println("Cant de entradas correctas: "+correctInput);
        System.out.println("Cant de entradas incorrectas: "+incorrectInput);
        
        
        
    }
    
}
