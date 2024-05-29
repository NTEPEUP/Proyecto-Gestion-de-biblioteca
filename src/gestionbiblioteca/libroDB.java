/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionbiblioteca;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nelson
 */
public class libroDB {
    
      private coneccion bibliotecaConexion=new coneccion();
    public libroDB(){
        this.bibliotecaConexion=new coneccion();
  
    
    }
    
    
    public boolean registrar(libro libro){
    
        try {
            String sql="INSERT INTO libro(ISBN,titulo,autor,anioPublicacion,editorial,stock) "
                    + "VALUES(?,?,?,?,?,?";
            
            Connection connection=this.bibliotecaConexion.getConexion();
            PreparedStatement sentencia=connection.prepareStatement(sql);
            
            sentencia.setString(1, libro.getISBN());
            sentencia.setString(2, libro.getTitulo());
            sentencia.setString(3, libro.getAutor());
            sentencia.setString(4, libro.getAnioPublicacion());
            sentencia.setString(5, libro.getAnioPublicacion());
            sentencia.setString(6, libro.getStock());
            
            sentencia.executeUpdate();
            sentencia.close();
            
            return true;
               
            
            
        } catch (Exception e) {
        }
        return false;
    }
    
    
    
    //metodo para eliminar 
    
    public boolean eliminar(String ISBN){
        try {
            
            String sql="DELETE FROM libro WHERE ISBN=?";
            Connection connection=this.bibliotecaConexion.getConexion();
            PreparedStatement sentencia=connection.prepareStatement(sql);
            sentencia.setString(1, ISBN);
            sentencia.executeUpdate();
            sentencia.close();
            
        } catch (Exception e) {
        }
        return true;
    }
    
    
    //metodo para editar los clientes
    
    public boolean editar(libro libro){
        try {
            String sql="UDPATE libro SET ISBN=?,titulo=?,autor=?,anioPublicacion=?,editoria=?,stock=? "
                    + "WHERE ISBN=?";
            
            Connection connection=this.bibliotecaConexion.getConexion();
            PreparedStatement sentencia=connection.prepareStatement(sql);
            sentencia.setString(1, libro.getISBN());
            sentencia.setString(2, libro.getTitulo());
            sentencia.setString(3, libro.getAutor());
            sentencia.setString(4, libro.getAnioPublicacion());
            sentencia.setString(5, libro.getAnioPublicacion());
            sentencia.setNString(6, libro.getStock());
                
       
            sentencia.executeUpdate();
            sentencia.close();
        } catch (Exception e) {
        }
    
    return false;
    }
    
    //metodo para listar clientes
    
    public List<libro>listar  (){
        
     List <libro> listaLibros=new ArrayList<>();
        try {
            
            String sql="SELECT* FROM libro";
            Connection connection=this.bibliotecaConexion.getConexion();
            PreparedStatement sentencia=connection.prepareStatement(sql);
            ResultSet data=sentencia.executeQuery();
            
            while (data.next()) {                
                libro e=new libro();
                e.setISBN(data.getString(1) );
                e.setTitulo(data.getString(2) );
                e.setAutor(data.getString(3) );
                e.setAnioPublicacion(data.getString(4) );
                e.setEditorial(data.getString(4) );
                e.setStock(data.getString(4) );
                
                
                listaLibros.add(e);
                
            }
            data.close();
            sentencia.close();
            
           
            
        } catch (Exception e) {
        }
        return listaLibros;
    
    }
    
    
}
