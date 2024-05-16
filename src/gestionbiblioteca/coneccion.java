/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionbiblioteca;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


/**
 *
 * @author Nelson
 */
public class coneccion {
    //declaramos variable
    Connection conexion=null;
    
    String usuario="rhmroadz";
    String contrasenia="5bvtZddC2M92VTDai6mOYcu7e-pHNJqS";
    String bd="rhmroadz";
    String ip="bubble.db.elephantsql.com";
    String puerto="5432";
    
    //String cadena="jdbc prosgresql://"+ip+":"+puerto+":"+bd;
    
    public Connection establecerConexion(){
        try {
            Class.forName("org.postgresql.Driver");
          
            String url="jdbc:postgresql://"+ip+":"+puerto+"/"+bd;
            conexion=DriverManager.getConnection(url, usuario, contrasenia);
            JOptionPane.showMessageDialog(null, "conexion exitosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "conexion fallida");
            
        }
        return conexion;
    
    }

    public Connection getConexion() {
        return conexion;
    }

   
    
}
