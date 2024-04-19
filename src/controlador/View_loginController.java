/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javax.swing.JOptionPane;


/**
 * FXML Controller class
 *
 * @author Nelson
 */
public class View_loginController implements Initializable {
   @FXML
    private TextField txtUser;
   
   @FXML
    private PasswordField txtPassword;
   @FXML
    private Button btnLogin;
   
   @FXML
   private void eventKey(KeyEvent event){
       Object evt=event.getSource();
       
       if (evt.equals(txtUser)) {
           
           if (event.getCharacter().equals(" ")) {
               event.consume();
           }
           
       }else if (evt.equals(txtPassword)) {
            if (event.getCharacter().equals(" ")) {
               event.consume();
           }
           
       }
   }
   @FXML
   private void eventAction(ActionEvent event){
       Object evt=event.getSource();
       
       if (evt.equals(btnLogin)) {
           
           if (txtUser.getText().isEmpty()&& !txtPassword.getText().isEmpty()) {
               
           }else{
               JOptionPane.showConfirmDialog(null, "error al iniciar sesion");
           }
           
       }
   }
   
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
