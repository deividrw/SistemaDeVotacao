/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import classes.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javax.swing.JOptionPane;


/**
 * FXML Controller class
 *
 * @author Deivid
 */
public  class AdmController  {
      String p;
    
    
    
    @FXML
    private static PasswordField passText;
    @FXML
    private static Button btnApurar;
    @FXML
    private TextArea txtA;
    @FXML
    private TextArea txtB;

    /**
     * Initializes the controller class.
     */
    protected  void initialize() {
        Main.addOnChagenScreenListener(new Main.OnChangeScreen() {
            @Override
            
            public void onScreenChaged(String newScreen, Object userData) {
                  if(newScreen.equals("adm"))
                System.out.println("tela ADM " +newScreen+ "," + userData);
            }
        });
        
    }    


    @FXML
    private void BotaoApurar(ActionEvent event) {
     
     p = JOptionPane.showInputDialog(null,"Digite a senha");

     
     if (p.equals("123")){
        txtA.setText(("Valdemiro: "+TelaGovController.valdemiroGov+"\n"+ "Ed Wilson: "+TelaGovController.edGov +"\n"
                +"Borba: "+TelaGovController.BorbaGov +"\n" + "Inês Brasil: " +TelaGovController.inesGov));
                
        
        txtB.setText(("Elon Musk: "+TelaPresidenteController.elon +"\n"+"Bolsonaro: "+ TelaPresidenteController.bolsonaro+"\n"
               +"Lula: "+TelaPresidenteController.lula+"\n"+"Tigresa VIP: "+TelaPresidenteController.tigresa));  
     }else{
         JOptionPane.showMessageDialog(null, "Pegue a senha com o ADM Deivid ou Edimar", "ATENÇÃO!",JOptionPane.ERROR_MESSAGE);
     }
     
        
        
    
        
    
       }
 
    
    
    
}