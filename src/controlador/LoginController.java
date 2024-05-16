package controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class LoginController {

    @FXML
    public Button btnlogin;

    @FXML
    public  PasswordField txtPasword;

    @FXML
    public TextField txtUser;
    
   Stage cargaStage=new Stage();
    public void clicEntrar(ActionEvent ActionEvent){
       String userTxt=txtUser.getText();
        String pasword=txtPasword.getText();
        try { 
            if((userTxt.equals("admin"))&&(pasword.equals("123"))){
            Parent root=FXMLLoader.load(getClass().getResource("/view/principal.fxml"));
                    Scene escena=new Scene(root);
                    cargaStage.setScene(escena);
                    cargaStage.show();
            }else{
                Alert mensaje= new Alert(Alert.AlertType.CONFIRMATION);
            mensaje.setTitle("ERROR AL INGRESAR");
            mensaje.setHeaderText("");
            mensaje.setContentText("CREDENCIALES INVALIDAS");
            mensaje.showAndWait();
            }
            
        } catch (Exception e) {
            
        }
        
        
           
           
           
      
            
        
            
    }
           
       }
  

