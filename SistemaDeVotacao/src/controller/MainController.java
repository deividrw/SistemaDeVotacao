/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import classes.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author Deivid
 */
public class MainController  {

    @FXML
    private Button btnInicio;
    @FXML
    private Button brnAdm;

    /**
     * Initializes the controller class.
     */
    
   
    

    @FXML
    public void BotaoInicio(ActionEvent event) {
        Main.changeScreen("presidente");
    }

    @FXML
    public void BotaoAdm(ActionEvent event) {
        Main.changeScreen("adm");
    }
    

    }
