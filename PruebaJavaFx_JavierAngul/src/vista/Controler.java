package vista;

import java.io.IOException;


import clase.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


	/**
	 * Es el controlador de la aplicacion
	 * 
	 * @author Javier Angulo
	 */
	public class Controler {
		
		//no lo estamos usando
		@FXML
		private ImageView imageRaw;

	    // referencias de la aplicacion
	    private Main mainApp;

	    /**
	     * Se realiza un llamamiento a la app para dar la referencia
	     * 
	     * @param mainApp
	     */
	    public void setMainApp(Main mainApp) {
	        this.mainApp = mainApp;
	    }

		/**
		 * Metodo sendStge sirve para enviar el perfil, asi estara hecho...
	     */
	    
	    public void sendStage() {
	        try {
	            // Load the fxml file and create a new stage for the popup.
	            FXMLLoader loader = new FXMLLoader();
	            loader.setLocation(Main.class.getResource("../vista/Send.fxml"));
	            AnchorPane page = (AnchorPane) loader.load();
	            Stage sendStage = new Stage();
	            sendStage.setTitle("Send");
	            Scene scene = new Scene(page);
	            sendStage.setScene(scene);

	            
	            sendStage.show();

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	    /**
	     * Metodo handle sirve para realizar la accion en el main
	     */
	    
	    @FXML
	    private void handleSend() {
	    	sendStage();
	    }

	    /**
	     * Este metodo el que cierra la aplicacion
	     */
	    @FXML
	    private void closeStage() {
	   	        System.exit(0);
	    }
	    }
