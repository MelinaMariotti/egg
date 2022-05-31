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
public class Circunferencia {
    
    /*ATRIBUTOS*/
    private double radio;
    
    /*METODO CONSTRUCTOR VACIO/POR DEFECTO*/
    public Circunferencia() {
    }
    
    /*METODO CONSTRUCTOR PARAMETRIZADO*/
    public Circunferencia(double radio) {
        this.radio = radio;
    }
    
    /*GETTERS Y SETTERS*/
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void getRadio(double nextDouble) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      
} /*FIN CLASE CIRCUNFERENCIA*/
