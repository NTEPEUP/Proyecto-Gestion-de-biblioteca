package controlador;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class LoginController {

    @FXML
    private Button btnlogin;

    @FXML
    private PasswordField txtPasword;

    @FXML
    private TextField txtUser;
   @FXML
   private void eventKey(KeyEvent event){
       Object evt=event.getSource();
       
       if (evt.equals(txtUser)) {
           
           if (event.getCharacter().equals("")) {
               event.consume();
           }
           
       }else if (evt.equals(txtPasword)) {
            if (event.getCharacter().equals("")) {
               event.consume();
           }
           
       }
   }
}

