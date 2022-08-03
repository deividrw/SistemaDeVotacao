/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package controller;



import classes.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 *
 * @author Deivid
 */
public class TelaPresidenteController  {
    static int votoPresidente, elon = 0,lula = 0,tigresa = 0,bolsonaro = 0;
    
    
    
    private Label label;
    
    @FXML
    public  TextField txtNumVoto;
    @FXML
    public Button btnVoto;
    @FXML
    private Label voto10;
    @FXML
    private Label voto69;
    @FXML
    private Label voto13;
    @FXML
    private Label voto17;
    
    
   
    @FXML
     protected void initialize() {
        Main.addOnChagenScreenListener(new Main.OnChangeScreen() {
            @Override
            
            public void onScreenChaged(String newScreen, Object userData) {
                  if(newScreen.equals("presidente"))
                System.out.println("tela Presidente " +newScreen+ "," + userData);
            }
        });
        
    }    

    @FXML
    private void BotaoVotar(ActionEvent event) {
        votoPresidente = Integer.valueOf(txtNumVoto.getText());
        
                
       if(votoPresidente == 10){
            elon = elon +1;
        }else if (votoPresidente == 13){
            lula = lula + 1;
        }else if (votoPresidente == 69){
            tigresa = tigresa +1;
        }else if (votoPresidente == 17){
            bolsonaro = bolsonaro+1;
        }else{
            JOptionPane.showMessageDialog(null, "Voto invalido!!!");
        }
        
       
       
       if(votoPresidente == 10 || votoPresidente == 13 || votoPresidente == 69 || votoPresidente == 17 ){
           txtNumVoto.setText(null);
           Main.changeScreen("gov");
       }
       
       
       
           
   
    }
    
}
