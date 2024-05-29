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
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

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
    private TextField txtStock;

    @FXML
    private TextField txtTitulo;

    
    @FXML
    public void guardarLibro(ActionEvent event) {
        
        try {
           libroDB c1=new libroDB();
     c1.registrar(new libro(txtISBN.getText(), txtTitulo.getText(),txtAutor.getText(),txtAnio.getText(),txtEditorial.getText(),txtStock.getText()));
          
        } catch (Exception e) {
            
        }

    
    
    }

    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
