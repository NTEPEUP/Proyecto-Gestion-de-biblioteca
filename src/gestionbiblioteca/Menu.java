/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package gestionbiblioteca;

import java.io.IOException;
import java.util.concurrent.ConcurrentMap;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Nelson
 */
public class Menu extends Application {
    
  public static Stage currentStage;
  
  
  
  
  
  
  
  //cargar ventana principal
    @Override
    public void start(Stage primaryStage) throws IOException {
       
        
    Parent root=FXMLLoader.load(getClass().getResource("/view/login.fxml"));
                    Scene escena=new Scene(root);
                    primaryStage.setScene(escena);
                    primaryStage.show();
                    currentStage=primaryStage;
    }
    //cerrar las ventanas
    public void cerrarVentana(Stage stage){
     stage.close();
    }
    public static void main(String[] args) {
        launch(args);
        //
    }
}
