/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionbiblioteca;

import com.sun.jdi.connect.spi.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
            st.setString(4, e.getIdentifiacion());
            
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
    
    
    
    
}
