/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package classes;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Deivid
 */
public class Main extends Application {
    private static Stage stage;
    
    private static Scene mainScene;
    private static Scene govTela;
    private static Scene PresTela;
    private static Scene adm;
    private static Scene fim;
    private static Scene fim2;

   

    
    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        
        Parent fxmlMain = FXMLLoader.load(getClass().getResource("/views/Main.fxml"));
        mainScene = new Scene(fxmlMain, 750, 555);

        Parent fxmlGov = FXMLLoader.load(getClass().getResource("/views/Governador.fxml"));
        govTela = new Scene(fxmlGov, 890, 555);
        
        Parent fxmlPres = FXMLLoader.load(getClass().getResource("/views/Presidente.fxml"));
        PresTela = new Scene(fxmlPres, 890, 555);
        
        Parent fxmlAdm = FXMLLoader.load(getClass().getResource("/views/Adm.fxml"));
        adm = new Scene(fxmlAdm, 520, 400);
        
        Parent fxmlFim = FXMLLoader.load(getClass().getResource("/views/VotoFim.fxml"));
        fim = new Scene(fxmlFim, 261, 300);
        
       
        
        
        
        
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }   
     
   
    public static void changeScreen(String scr,Object userData){
        switch (scr){
            case "main":
            stage.setScene(mainScene);
                notifyAllListener("main",userData);
            break;
            case "presidente":
            stage.setScene(PresTela);
                notifyAllListener("presidente",userData);
            break;
            case "gov":
            stage.setScene(govTela);
                 notifyAllListener("gov",userData);
            break;   
            case "adm":
            stage.setScene(adm);
                notifyAllListener("adm",userData);
            break;
            case "fim":
            stage.setScene(fim);
                notifyAllListener("fim",userData);
            break;
            
            
    }  
}
     public static void changeScreen(String scr){
         changeScreen(scr, null);
     }
     
     
    public static void main(String[] args) {
        launch(args);
    }
    
    //--------------------------------------------------------------//
    
    
    private static ArrayList<OnChangeScreen> listeners = new ArrayList<>();
    
    public static interface OnChangeScreen{

         void onScreenChaged(String newScreen, Object userData);
    }
    
    public static void addOnChagenScreenListener(OnChangeScreen newListener){
        listeners.add(newListener);
    }
    
    private static void notifyAllListener(String newScreen,Object userData){
        for(OnChangeScreen l : listeners)
            l.onScreenChaged(newScreen,userData);
    }
}
