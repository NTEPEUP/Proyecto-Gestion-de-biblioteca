/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionbiblioteca;

/**
 *
 * @author Nelsonhhg
 */
public class libro {
    
 //definimos los atributos de la clase libro
private int ISBN;
private String titulo;
private String autor;
private String año;
private String editorial;
private String stock;

    public libro(int ISBN, String titulo, String autor, String año, String editorial, String stock) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
        this.editorial = editorial;
        this.stock = stock;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
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
        return año;
    }

    public void setAño(String año) {
        this.año = año;
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




}
