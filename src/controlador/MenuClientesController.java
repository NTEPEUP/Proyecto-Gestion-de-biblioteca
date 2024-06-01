/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;

import com.sun.marlin.DualPivotQuicksort20191112Ext;
import gestionbiblioteca.cliente;
import gestionbiblioteca.clienteDB;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Set;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Nelson
 */
public class MenuClientesController  implements Initializable  {

    /**
     * Initializes the controller class.
     */
    Stage registrarClienteStage=new Stage ();
    
      @FXML
    private Button btnGuardarCliente;
    @FXML
    private TextField txtDirCliente;

    @FXML
    private TextField txtIdCliente;

    @FXML
    private TextField txtNomCliente;

    @FXML
    private TextField txtTelCliente;
      
    //Variables de las columnas
     @FXML
    private TableColumn<cliente, String> dirCol;

    @FXML
    private TableColumn<cliente, String> idCol;

    @FXML
    private TableColumn<cliente, String> nomCol;
       @FXML     
    private TableColumn<cliente, String> telCol;
    
    
    
    @FXML
    private TableView<cliente> tblRegistro;

    private clienteDB clienteB;
   
  String identificacion;
    
    
     public void initialize(URL url, ResourceBundle rb) {
         
         this.clienteB=new clienteDB();
         
         cargarClientes();
        // TODO
    }  
     
     //METODO PARA GUARDAR CLIENTES EN LA BASE DE DATOS
     
     @FXML
      public void guardarCliente(ActionEvent event) {
          try {
              //creamos un objeto de la clase clienteDB
            clienteDB c1=new clienteDB();
            //invocamos el metodo registrar de la clase cliente DB y ingresamos datos para registrar datos 
            //en la tabla de la base de datos
     c1.registrar(new cliente(txtNomCliente.getText(), txtDirCliente.getText(),txtTelCliente.getText(),txtIdCliente.getText()));
     // ventana pra indicar que los datos fueron guardados correctamente
      Alert mensaje= new Alert(Alert.AlertType.CONFIRMATION);
            mensaje.setTitle("CONFIRMACION ");
            mensaje.setHeaderText("");
            mensaje.setContentText("DATOS GUARDADOS CORRECTAMENTE");
            mensaje.showAndWait();
              cargarClientes();
          
        } catch (Exception e) {
            
        }
    }
      
      //METODO PARA EDITAR CLIENES
          @FXML
    public void editarCliente(ActionEvent event) {
        
              try {
                          clienteDB c2=new clienteDB();
                          cliente c22=new cliente();
        
        c22.setNombre(txtNomCliente.getText());
        c22.setDireccion(txtDirCliente.getText());
        c22.setTelefono(txtTelCliente.getText());
        c22.setIdentificacion(txtIdCliente.getText());
        
        clienteB.editar(c22);
        
              } catch (Exception e) {
              }
    }

    

    @FXML
    public void eliminarCliente(ActionEvent event) {
        clienteDB c4=new clienteDB();
        cliente c44=new cliente();
        c44.setIdentificacion(txtIdCliente.getText());
        clienteB.eliminar(c44);
        Alert mensaje= new Alert(Alert.AlertType.CONFIRMATION);
            mensaje.setTitle("CONFIRMACION ");
            mensaje.setHeaderText("");
            mensaje.setContentText("Cliente eliminado correctamente");
            mensaje.showAndWait();
           cargarClientes();
        

    }
 
    //METODO PARA SELECCIONAR LOS DATOS DE LA TABLA 
    @FXML
    public void getDatos(MouseEvent event) {
        cliente clien=tblRegistro.getSelectionModel().getSelectedItem();
        identificacion=clien.getIdentificacion();
        txtNomCliente.setText(clien.getNombre());
        txtDirCliente.setText(clien.getDireccion());
         txtTelCliente.setText(clien.getTelefono());
         txtIdCliente.setText(clien.getIdentificacion());
         
          btnGuardarCliente.setDisable(true);
          
    }

    
    //
     
     
   public void cargarClientes(){
      tblRegistro.getItems();
       tblRegistro.getColumns();
       
       List<cliente>clientes=this.clienteB.listar();
       ObservableList<cliente>data=FXCollections.observableArrayList(clientes);
       
       
       nomCol.setCellValueFactory(new PropertyValueFactory("nombre"));
       
       dirCol.setCellValueFactory(new PropertyValueFactory("direccion"));
   
       telCol.setCellValueFactory(new PropertyValueFactory("telefono"));
       
       idCol.setCellValueFactory(new PropertyValueFactory("identificacion"));
       
       tblRegistro.setItems(data);
       
        
   }
       /**
       tblRegistro.getItems();
       tblRegistro.getColumns();
       
       
       ArrayList<cliente>lista=new ArrayList<>();
       
       clienteB.mostrarLibros(lista);
       
       listaOriginal=FXCollections.observableArrayList(lista);
       
       TableColumn nomcol=new TableColumn("NOMBRE ");
       nomcol.setCellValueFactory(new PropertyValueFactory("nombre"));
       TableColumn dircol=new TableColumn("DIRECCION");
       dircol.setCellValueFactory(new PropertyValueFactory("direccion"));
       TableColumn telcol=new TableColumn("TELEFONO");
       telcol.setCellValueFactory(new PropertyValueFactory("telefono"));
       TableColumn idcol=new TableColumn("IDENTIFICACION ");
       idcol.setCellValueFactory(new PropertyValueFactory("identificacion"));
       
       tblRegistro.getColumns().addAll(nomcol,dircol,telcol,idcol);
       tblRegistro.setItems(listaOriginal);
       
       
   }
       
  */     
      
     
       
   
  
   
    
    
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
     