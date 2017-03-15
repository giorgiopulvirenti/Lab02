package it.polito.tdp.alien;

/**
 * Sample Skeleton for 'Alien.fxml' Controller Class
 */


/**
 * Sample Skeleton for 'Alien.fxml' Controller Class
 */


import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import java.util.TreeMap;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {
	
	TreeMap <String,Parola>lista=new TreeMap<String,Parola>();

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtInsert"
    private TextField txtInsert; // Value injected by FXMLLoader

    @FXML // fx:id="btnTranslate"
    private Button btnTranslate; // Value injected by FXMLLoader

    @FXML // fx:id="txtResult"
    private TextArea txtResult; // Value injected by FXMLLoader

    @FXML // fx:id="btnClear"
    private Button btnClear; // Value injected by FXMLLoader

    @FXML
    void doClear(ActionEvent event) {

    }

    @FXML
    void doTranslate(ActionEvent event) {
    	String array1[];
    	String somma="";
    	String array[]=this.txtInsert.getText().split(" ");
    	txtInsert.clear();
    	this.txtResult.clear();
    	if(array[0].toLowerCase().matches("[a-z]*")){
    	if (array.length==2){
    		
    		if(lista.containsKey(array[0]))
    			lista.get(array[0].toLowerCase()).addTranslate(array[1].toLowerCase());
    		else 
    			lista.put(array[0].toLowerCase(), new Parola(array[0].toLowerCase(),array[1].toLowerCase()));
    		
    	}

    	}
    		if (array.length==1){
    			System.out.println("1@@@@@");
    			if ( array[0].toLowerCase().indexOf("?")!=-1&&
    					array[0].toLowerCase().length() - array[0].toLowerCase().replace("?", "").length()==1){
    				System.out.println(array[0]);
    				 array1=array[0].toLowerCase().replace("?", ";").split(";");
    				for(char a='a';a<='z';a++){
    					System.out.println("1@@@@@"+a);
    					somma= array1[0]+a+array1[1];
    					if(lista.containsKey(somma)){
    		    			this.txtResult.setText(lista.get(somma.toLowerCase()).getLista());
    		    			System.out.println("@@@@@");
    					
    					}
    				}
    			}
    			if(lista.containsKey(array[0]))
    			this.txtResult.setText(lista.get(array[0].toLowerCase()).getLista());
    		
    		}
    			
    	
    	
    	

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtInsert != null : "fx:id=\"txtInsert\" was not injected: check your FXML file 'Alien.fxml'.";
        assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
        assert btnClear != null : "fx:id=\"btnClear\" was not injected: check your FXML file 'Alien.fxml'.";

    }
}
