/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Nelson
 */
public class PrincipalController {

    /**
     * Initializes the controller class.
     * 
     * 
     */
    Stage cargarclienteStage=new Stage ();
     
    public void cargarClientes(MouseEvent event) {
        try {
                Parent root=FXMLLoader.load(getClass().getResource("/view/menuClientes.fxml"));
                    Scene escena=new Scene(root);
                    cargarclienteStage.setScene(escena);
                    cargarclienteStage.show();
        } catch (Exception e) {
        }
        
    
    

    }

    
    public void cargarLibros(MouseEvent event) {
         try {
                Parent root=FXMLLoader.load(getClass().getResource("/view/menuLibros.fxml"));
                    Scene escena=new Scene(root);
                    cargarclienteStage.setScene(escena);
                    cargarclienteStage.show();
        } catch (Exception e) {
        }

    }

    
    public void cargarPtm(MouseEvent event) {
         try {
                Parent root=FXMLLoader.load(getClass().getResource("/view/formPrestamo.fxml"));
                    Scene escena=new Scene(root);
                    cargarclienteStage.setScene(escena);
                    cargarclienteStage.show();
        } catch (Exception e) {
        }

    }

  
}
