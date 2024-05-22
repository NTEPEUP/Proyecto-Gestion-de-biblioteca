/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;

import gestionbiblioteca.cliente;
import gestionbiblioteca.clienteDB;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Nelson
 */
public class MenuClientesController  {

    /**
     * Initializes the controller class.
     */
    Stage registrarClienteStage=new Stage ();
    
    
    
      @FXML
    private TableColumn<cliente, String> dirCliente;

    @FXML
    private TableColumn<cliente, String> dpi;

    @FXML
    private TableColumn<cliente, String> nomUsuario;

    
    @FXML
    private TableColumn<cliente, String> telCliente;
    @FXML
    private TableView<cliente> tblRegistro;

    
   
    clienteDB clienteB=new clienteDB();
    
     public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
   public void cargarClientes(){
       
       tblRegistro.getItems().clear();
       tblRegistro.getColumns().clear();
       
       
       List <cliente>clientes=clienteB.obtenerTodos();
       
       ObservableList<cliente>data=FXCollections.observableArrayList(clientes);
       
       
       
       TableColumn nombre=new TableColumn("nombre");
       nombre.setCellValueFactory(new PropertyValueFactory("nombre"));
       TableColumn direccion=new TableColumn("direccion");
       direccion.setCellValueFactory(new PropertyValueFactory("direccion"));
       TableColumn telefono=new TableColumn("telefono");
       telefono.setCellValueFactory(new PropertyValueFactory("telefono"));
       TableColumn identificacion=new TableColumn("identificacion");
       identificacion.setCellValueFactory(new PropertyValueFactory("identificacion"));
       
       
       tblRegistro.setItems(data);
       tblRegistro.getColumns().addAll(nombre,direccion,telefono,identificacion);
       
       
       
       
               }
  
   
    
    
    public void registrarCliente(ActionEvent ActionEvent) throws IOException{
        {
                Parent root=FXMLLoader.load(getClass().getResource("/view/formClientes.fxml"));
                    Scene escena=new Scene(root);
                    registrarClienteStage.setScene(escena);
                    registrarClienteStage.show();
        } 
    
    }
     public void volverPrincipal(ActionEvent ActionEvent) throws IOException{
        {
               
    
        }}
}
     