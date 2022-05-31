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
public class Libro {
    
    //atributos
    
    private int ISBN;
    
    private String Titulo;
    
    private String Autor;
    
    private int CantPaginas;
    
    /*CONSTRUCTOR VACIO*/
    public Libro() {
    }
    
    /*CONSTRUCTOR PARAMETRIZADO*/
    public Libro(int ISBN, String Titulo, String Autor, int CantPaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.CantPaginas = CantPaginas;
    }
    
    /*GETTERS Y SETTERS*/

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getCantPaginas() {
        return CantPaginas;
    }

    public void setCantPaginas(int CantPaginas) {
        this.CantPaginas = CantPaginas;
    }
    
    
    
    
    
} /*FIN CLASE LIBRO*/
