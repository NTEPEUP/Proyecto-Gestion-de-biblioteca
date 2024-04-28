/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionbiblioteca;

import java.io.Serializable;

/**
 *
 * @author Nelsonhhg
 */
public class libro implements Serializable{
    
 //definimos los atributos de la clase libro
private String ISBN;
private String titulo;
private String autor;
private String anio;
private String editorial;
private String stock;

    public libro(String ISBN, String titulo, String autor, String año, String editorial, String stock) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.editorial = editorial;
        this.stock = stock;
    }

    public  String etISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAño() {
        return anio;
    }

    public void setAño(String anio) {
        this.anio = anio;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", anio=" + anio + ", editorial=" + editorial + '}';
    }




}
