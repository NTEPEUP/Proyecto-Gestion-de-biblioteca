/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionbiblioteca;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;

/**
 *
 * @author Nelson
 */
public class clienteDB {
    
      private coneccion bibliotecaConexion=new coneccion();
    public clienteDB(){
        this.bibliotecaConexion=new coneccion();
  
    
    }
    
    
    public boolean registrar(cliente cliente){
    
        try {
            //defino la consulta hacia la base de datos
            String sql="INSERT INTO cliente(nombre,direccion,telefono,identificacion) "
                    + "VALUES(?,?,?,?)";
            //Defino la conexion con la base de datos
            Connection connection=this.bibliotecaConexion.getConexion();
            PreparedStatement sentencia=connection.prepareStatement(sql);
            
            sentencia.setString(1, cliente.getNombre());
            sentencia.setString(2, cliente.getDireccion());
            sentencia.setString(3, cliente.getTelefono());
            sentencia.setString(4, cliente.getIdentificacion());
            
            sentencia.executeUpdate();
            sentencia.close();
            
            return true;
               
            
            
        } catch (Exception e) {
        }
        return false;
    }
    
    
    
    //metodo para eliminar 
    
    public boolean eliminar(cliente identificacion){
        try {
            
            String sql="DELETE FROM cliente WHERE identificacion=?";
            Connection connection=this.bibliotecaConexion.getConexion();
            PreparedStatement sentencia=connection.prepareStatement(sql);
            sentencia.setString(1, identificacion.getIdentificacion());
            sentencia.executeUpdate();
            sentencia.close();
            
        } catch (Exception e) {
        }
        return true;
    }
    
    
    //metodo para editar los clientes
    
    public boolean editar(cliente cliente){
        try {
            String sql="UDPATE cliente SET nombre=?,direccion=?,telefono=?"
                    + "WHERE identificacion=?";
            
            Connection connection=this.bibliotecaConexion.getConexion();
            PreparedStatement sentencia=connection.prepareStatement(sql);
            sentencia.setString(1, cliente.getNombre() );
            sentencia.setString(2, cliente.getDireccion() );
            sentencia.setString(3, cliente.getTelefono() );
            
            sentencia.setString(4, cliente.getIdentificacion() );
                
       
            sentencia.executeUpdate();
            sentencia.close();
            
            return true;
        } catch (Exception e) {
            return false;
        }
    
   
    }
    
    //metodo para listar clientes
    
    public List<cliente>listar  (){
        
     List <cliente> listaClientes=new ArrayList<>();
        try {
            
            String sql="SELECT* FROM cliente";
            Connection connection=this.bibliotecaConexion.getConexion();
            PreparedStatement sentencia=connection.prepareStatement(sql);
            ResultSet data=sentencia.executeQuery();
            
            while (data.next()) {                
                cliente e=new cliente();
                e.setNombre(data.getString(1) );
                e.setDireccion(data.getString(2) );
                e.setTelefono(data.getString(3) );
                e.setIdentificacion(data.getString(4) );
                
                listaClientes.add(e);
                
                
            }
            data.close();
            sentencia.close();
            
           
            
        } catch (Exception e) {
        }
        return listaClientes;
    
    }
    
    
    
    
    
    
    
    
    
    /**
   java.sql.Connection conn;
    
    public clienteDB() {
        conn = conexionBD.getConnection();
    }
    // metodo para agregar clientes a la base de datos
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
    
    //meto d
    public void mostrarLibros(ArrayList<cliente> obtenerTodos ){
        
        PreparedStatement st = null;
        ResultSet rs = null;
       
        
        try {
            
              
              String sql = """
                         SELECT * 
                         FROM cliente
                         """;
          st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                
      
                cliente e=new cliente();
                e.setNombre(rs.getString(1));
                e.setDireccion(rs.getString(2));
                e.setTelefono(rs.getString(3));
                e.setIdentificacion(rs.getString(4));
                
                obtenerTodos.add(e);
             }
                rs.close();
                st.close();
            
        } catch (SQLException e) {
            
        }

        
    }
    public ObservableList<cliente> listar(){
       PreparedStatement st = null;
        ResultSet rs = null;
       ObservableList<cliente> a = FXCollections.observableArrayList();
        
        try {
            String sql = """
                         SELECT * 
                         FROM cliente
                         """;
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
           
               
                 a.add(new cliente(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)));
               
             }
            rs.close();
            
           
            
            
        } catch (SQLException ex) {
            Logger.getLogger(clienteDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
    
}*/}
    
    

