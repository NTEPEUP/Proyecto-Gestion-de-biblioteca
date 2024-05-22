/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionbiblioteca;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nelson
 */
public class clienteDB {
   java.sql.Connection conn;
    
    public clienteDB() {
        conn = conexionBD.getConnection();
    }
    
    public void agregar(cliente e) {
        
    PreparedStatement st = null;
    
        try {
            String sql = """
                         INSERT INTO cliente(nombre,direccion,telefono,identificacion) 
                                            VALUES (?, ?, ?, ?)
                         """;
            st = conn.prepareStatement(sql);
            st.setString(1, e.getNombre());
            st.setString(2, e.getDireccion());
            st.setString(3, e.getTelefono());
            st.setString(4, e.getIdentificacion());
            
            st.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(clienteDB.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(clienteDB.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    
    public ArrayList<cliente> obtenerTodos() {
        
        Statement st = null;
        ResultSet rs = null;
        ArrayList<cliente> a = new ArrayList();
        
        try {
            String sql = """
                         SELECT * 
                         FROM cliente
                         """;
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                
           
              
            
             
               
                 a.add(new cliente(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)));
                
             }
           
            
            return a;
        } catch (SQLException ex) {
            Logger.getLogger(clienteDB.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                
                if (st != null) {
                    st.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(clienteDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return null;
    }
}
    
    

