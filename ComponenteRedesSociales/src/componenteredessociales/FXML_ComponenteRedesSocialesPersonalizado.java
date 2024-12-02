/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componenteredessociales;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;


/**
 *
 * @author alumno
 */
public class FXML_ComponenteRedesSocialesPersonalizado extends AnchorPane{
    
    private FXML_ComponenteRedesSocialesController controlador ;
    
    public FXML_ComponenteRedesSocialesPersonalizado(){
        super();
        
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML_ComponenteRedesSociales.fxml"));

            controlador = new FXML_ComponenteRedesSocialesController();

            loader.setController(controlador);

            Node n = loader.load();
            this.getChildren().add(n);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
    
    public FXML_ComponenteRedesSocialesController getController(){
        return controlador;
    }
            
            
}
