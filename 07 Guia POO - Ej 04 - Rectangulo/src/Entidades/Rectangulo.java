/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author melim
 */
public class Rectangulo {
    
    //ATRIBUTOS
    private int base;
    private int altura;

    //CONTRUCTOR VACIO
    public Rectangulo() {
    }
    
    //CONTRUCTOR PARAMETRIZADO
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    //GETTERS AND SETTERS
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
    
    
    
   
} // FIN CLASE RECTANGULO
