/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionbiblioteca;

/**
 *
 * @author Nelson
 */
public class libro {
    private String ISBN;
    private String titulo;
    private String autor;
    private String anioPublicacion;
    private String editorial;
    
    public libro(){
    
    }
    
    public libro(String ISBN, String titulo, String autor, String anioPublicacion, String editorial) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.editorial = editorial;
        
    }

    public String getISBN() {
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

    public String getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(String anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

  

    @Override
    public String toString() {
        return "libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", anioPublicacion=" + anioPublicacion + ", editorial=" + editorial +'}';
    }
    
    
    
    
}
