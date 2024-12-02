/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package ejemplocomponenterrss;

import componenteredessociales.FXML_ComponenteRedesSocialesPersonalizado;
import componenteredessociales.FXML_ComponenteRedesSocialesController;
import java.io.IOException;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author alumno
 */
public class EjemploComponenteRRSSController implements Initializable {

    @FXML
    private FXML_ComponenteRedesSocialesPersonalizado componenteRedesSocialesPersonalizado;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        FXML_ComponenteRedesSocialesController controlador = componenteRedesSocialesPersonalizado.getController();
        
        controlador.setUserData_Facebook("https://www.facebook.com/navantiaoficial/?locale=es_ES");
        controlador.setUserData_Instagram("https://www.instagram.com/navantia_oficial/");
        controlador.setUserData_Twitter("https://x.com/NavantiaOficial");
        
        controlador.getImgview_facebook().setOnMouseClicked(this::manejarImgOnClick);
        controlador.getImgview_twitter().setOnMouseClicked(this::manejarImgOnClick);
        controlador.getImgview_instagram().setOnMouseClicked(this::manejarImgOnClick);
        
    }    
    
    private void manejarImgOnClick(MouseEvent event){
        ImageView img = (ImageView) event.getSource();
        
        String url = (String) img.getUserData();
        
        
        try{
           new ProcessBuilder("firefox", url).start();


        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
