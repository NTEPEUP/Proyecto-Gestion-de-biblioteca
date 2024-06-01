/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;

import gestionbiblioteca.cliente;
import gestionbiblioteca.clienteDB;
import gestionbiblioteca.libro;
import gestionbiblioteca.libroDB;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Nelson
 */
public class MenuLibrosController implements Initializable {

    /**
     * Initializes the controller class.
     */
      @FXML
    private TableView<libro> tblRegistro;
 

    @FXML
    private TextField txtAnio;

    @FXML
    private TextField txtAutor;

    @FXML
    private TextField txtEditorial;

    @FXML
    private TextField txtISBN;

    @FXML
    private Button btbGuardarLibro;


    @FXML
    private TextField txtTitulo;
  
    private libroDB libroDB;
    
    //VARIABLES PARA LAS COLUMNAS DE LA TABLE VIEW
    @FXML
    private TableColumn<libro, String> aPublicacion;

    @FXML
    private TableColumn<libro, String> autorCol;

    
    @FXML
    private TableColumn<libro, String> editorialCol;

    @FXML
    private TableColumn<libro, String> isbnCol;

    
    @FXML
    private TableColumn<libro, String> tituloCol;
    
    
   
    public void initialize(URL url, ResourceBundle rb) {
       this.libroDB=new libroDB();
         
         cargarLibros();
}
    
    @FXML
    public void guardarLibro(ActionEvent event) {
        
        try {
           libroDB c1=new libroDB();
     c1.registrar(new libro(txtISBN.getText(), txtTitulo.getText(),txtAutor.getText(),txtAnio.getText(),txtEditorial.getText()));
           Alert mensaje= new Alert(Alert.AlertType.CONFIRMATION);
            mensaje.setTitle("CONFIRMACION");
            mensaje.setHeaderText("");
            mensaje.setContentText("LIBRO REGISTRADO CORRECTAMENTE");
            mensaje.showAndWait();
            cargarLibros();
        } catch (Exception e) {
            
        }}
        
         @FXML
   public void EliminarLibro(ActionEvent event) {
       libroDB c4=new libroDB();
        libro c44=new libro();
        c44.setISBN(txtISBN.getText());
        libroDB.eliminar(c44);
        Alert mensaje= new Alert(Alert.AlertType.CONFIRMATION);
            mensaje.setTitle("CONFIRMACION ");
            mensaje.setHeaderText("");
            mensaje.setContentText("Cliente eliminado correctamente");
            mensaje.showAndWait();
           cargarLibros();

    }

       //METODO, CUANDO HACEMOS CLIC EN ALGUNO DE LOS REGISTRO DE LA TABLA
    //AUTOMATICAMENTE SE LLENAN LO TEXTFIELDS 
    
        @FXML
    public void getData(MouseEvent event) {
    libro lib=tblRegistro.getSelectionModel().getSelectedItem();
    txtISBN.setText(lib.getISBN());
    txtTitulo.setText(lib.getTitulo());
    txtAutor.setText(lib.getAutor());
    txtAnio.setText(lib.getAnioPublicacion());
    txtEditorial.setText(lib.getEditorial());
   
    btbGuardarLibro.setDisable(true);

    }

    
    
    
public void cargarLibros(){
      tblRegistro.getItems();
       tblRegistro.getColumns();
       
       List<libro>libros=this.libroDB.listar();
       ObservableList<libro>data=FXCollections.observableArrayList(libros);
       
       
      
       isbnCol.setCellValueFactory(new PropertyValueFactory("ISBN"));
      
       tituloCol.setCellValueFactory(new PropertyValueFactory("titulo"));
      
       autorCol.setCellValueFactory(new PropertyValueFactory("autor"));
       
       aPublicacion.setCellValueFactory(new PropertyValueFactory("anioPublicacion"));
      
       editorialCol.setCellValueFactory(new PropertyValueFactory("editorial"));
       tblRegistro.setItems(data);
     
        
    
    
    
    
        // TODO
    }    
    
}
