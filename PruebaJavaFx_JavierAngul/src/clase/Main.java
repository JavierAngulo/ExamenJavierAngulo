package clase;

import java.io.IOException;
import java.util.Map;

import com.sun.prism.Image;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * Se realiza esta aplicacion para un examen de Desarrollo de interfaces en el cual 
 * se nos pide realizar un ejercicio.
 * @author angulo
 *
 */
public class Main extends Application {
	
	/**
	 * @paran los parametros q recibe la aplicacion
	 * @autor javier angulo
	 * @version 1.0
	 */
	private AnchorPane rootLayout;
	public Stage primaryStage;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			this.primaryStage = primaryStage;
			this.primaryStage.setTitle("My GitHub Profile");
			// ponemos un icono a la ventan
		   
			this.primaryStage.setX(200);
			this.primaryStage.setY(200);

			primaryStage.show();
			
			initRootLayout();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	
	}
	/**
	 * 
	 * @paran initRootLayout
	 */
	
	public void initRootLayout() {
		try {
			// Load root layout from fxml file.
			FXMLLoader loader = new FXMLLoader();
			//nos referimos a la primera pantalla de fxml
			loader.setLocation(Main.class.getResource("../vista/Profile.fxml"));
			rootLayout = (AnchorPane) loader.load();

			// Show the scene containing the root layout.
			Scene scene = new Scene(rootLayout, 600, 400);
			scene.getStylesheets().add(
					getClass().getResource("application.css").toExternalForm());

			primaryStage.setScene(scene);
			

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * Se lanza la app
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}
}



