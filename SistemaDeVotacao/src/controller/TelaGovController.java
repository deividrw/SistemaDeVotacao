/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import classes.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Deivid
 */
public  class  TelaGovController {
     static int votoGov, edGov=0, BorbaGov=0, inesGov=0, valdemiroGov=0;
    
    @FXML
    private  Button btnVotoGov;
    @FXML
    private  TextField txtNumGov;

       @FXML
    protected  void initialize() {
        Main.addOnChagenScreenListener(new Main.OnChangeScreen() {
            @Override
            
            public void onScreenChaged(String newScreen, Object userData) {
                  if(newScreen.equals("gov"))
                System.out.println("tela Governador " +newScreen+ "," + userData);
            }
        });
        
    }    


    @FXML
    private  void BotaoVotarGov(ActionEvent event) {
         votoGov = Integer.valueOf(txtNumGov.getText());
        
        if(votoGov == 100){
            edGov = edGov +1;
        }else if (votoGov == 171){
            valdemiroGov = valdemiroGov +1;
        }else if (votoGov == 511){
           BorbaGov = BorbaGov +1;
        }else if (votoGov == 154){
            inesGov = inesGov + 1;
        }else{
            JOptionPane.showMessageDialog(null, "Voto invalido!!!");
        }
        
  
        
        if (votoGov == 100 || votoGov == 171 || votoGov == 511 || votoGov == 154){
            JOptionPane.showMessageDialog(null, "Votos Computados!!!");
            txtNumGov.setText(null);
            Main.changeScreen("fim");
            
            
            
        }   
        
        
        
        
    }
    
}
