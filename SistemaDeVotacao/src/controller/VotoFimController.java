/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import classes.Main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;



/**
 * FXML Controller class
 *
 * @author Deivid
 */
public  class VotoFimController {

    @FXML
    private Button btnApurar;
    @FXML
    private Label lblResultadoPres;
    @FXML
    private Label lblResultadoGov;


    
    protected  void initialize() {
        Main.addOnChagenScreenListener(new Main.OnChangeScreen() {
            @Override
            
            public void onScreenChaged(String newScreen, Object userData) {
                  if(newScreen.equals("fim"))
                System.out.println("tela fim " +newScreen+ "," + userData);
            }
        });
        
    }   
    
 
    
   

    @FXML
    private void BotaoApurar1(ActionEvent event) {
         
        if(TelaPresidenteController.votoPresidente == 13){
             lblResultadoPres.setText("LULA");
         }if(TelaPresidenteController.votoPresidente == 17){
             lblResultadoPres.setText("Bolsonaro");
                       
         }if (TelaPresidenteController.votoPresidente == 69){
             lblResultadoPres.setText("Tigresa Vip");
            
         }if(TelaPresidenteController.votoPresidente == 10){
             lblResultadoPres.setText("Elon Musk"); 
         }
         
         
         
         
         
         if(TelaGovController.votoGov == 511){
               lblResultadoGov.setText("Borba");
            } if(TelaGovController.votoGov == 100){
            lblResultadoGov.setText("Ed Wilson");
            } if(TelaGovController.votoGov == 154){
                lblResultadoGov.setText("Inês Brazil");
            } if(TelaGovController.votoGov == 171){
                lblResultadoGov.setText("Valdemiro");
            
            } 
           
            
                        
}
    

    @FXML
    private void BotaoCont(ActionEvent event) {
        Main.changeScreen("main");
        lblResultadoPres.setText(null);
         lblResultadoGov.setText(null);
    }


    


  

    
  
}
