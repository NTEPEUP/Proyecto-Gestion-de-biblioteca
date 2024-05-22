/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;



import gestionbiblioteca.cliente;
import gestionbiblioteca.clienteDB;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;


import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Nelson
 */
public class FormClientesController { 
    /**
     * Initializes the controller class.
     * 
     
     * 
     */
    @FXML
    private TextField txtDirCliente;

    @FXML
    private TextField txtIdCliente;

    @FXML
    private TextField txtNombreCliente;

    @FXML
    private TextField txtTelCliente;
   
    
  
    @FXML
    public void guardarCliente(ActionEvent event) {
        try {
            clienteDB c1=new clienteDB();
     c1.agregar(new cliente(txtNombreCliente.getText(), txtDirCliente.getText(),txtTelCliente.getText(),txtIdCliente.getText()));
        } catch (Exception e) {
            
        }
  
     
        }
    
    
    
   
    
}
