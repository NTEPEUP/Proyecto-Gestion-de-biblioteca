/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionbiblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nelson
 */
public class conexionBD {
     private String url = "jdbc:postgresql://localhost:5432/cliente";
    private Properties properties = new Properties();
    private static Connection conn = null;
    
    private conexionBD () {
        properties.setProperty("user", "postgres");
        properties.setProperty("password", "nelson15");
        
        try {
            conn = DriverManager.getConnection(url, properties);
        } catch (SQLException ex) {
            Logger.getLogger(conexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static Connection getConnection() {
        if (conn == null) {
               conexionBD c = new conexionBD();
               return c.conn;
        }
        else {
            return conn ;
        }}}
    


