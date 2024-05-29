/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import com.sun.jdi.connect.spi.Connection;
import gestionbiblioteca.Clientes;
import gestionbiblioteca.coneccion;
import jdk.jfr.BooleanFlag;

/**
 *
 * @author Nelson
 */
public class ClienteBD {
    private coneccion conectar;
    
   public ClienteBD(){
       this.conectar=new coneccion();
   }
   
  public boolean registrar(Clientes clientes){
     
      
      try {
          String sql= "INSERT INTO cliente (nombre, direccion,telefono,identificacion) "
                  + "VALUES(?,?,?,?)";
          
      } catch (Exception e) {
      }
      return true;
  }
  
    
}
