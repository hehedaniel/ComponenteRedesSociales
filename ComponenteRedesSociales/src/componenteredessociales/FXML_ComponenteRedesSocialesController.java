/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package componenteredessociales;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

/**
 *
 * @author alumno
 */
public class FXML_ComponenteRedesSocialesController implements Initializable {
    
    @FXML
    private ImageView imgview_instagram;
    @FXML
    private ImageView imgview_twitter;
    @FXML
    private ImageView imgview_facebook;

    public String getUserData_Facebook(){
        String userData = (String) imgview_facebook.getUserData();
        return userData;
    }
    
    public String getUserData_Instagram(){
        String userData = (String) imgview_instagram.getUserData();
        return userData;
    }
        
    public String getUserData_Twitter(){
        String userData = (String) imgview_twitter.getUserData();
        return userData;
    }
    
    public void setUserData_Facebook(String userData){
        imgview_facebook.setUserData(userData);
    }
    
    public void setUserData_Instagram(String userData){
        imgview_instagram.setUserData(userData);
    }
        
    public void setUserData_Twitter(String userData){
        imgview_twitter.setUserData(userData);
    }
    
    public ImageView getImgview_instagram() {
        return imgview_instagram;
    }

    public ImageView getImgview_twitter() {
        return imgview_twitter;
    }

    public ImageView getImgview_facebook() {
        return imgview_facebook;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
