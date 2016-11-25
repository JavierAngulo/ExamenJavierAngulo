package application;
	
import java.io.IOException;
import java.util.Map;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class MainExamen extends Application {
	
		private AnchorPane rootLayout;
		public Stage primaryStage;
		@Override
		public void start(Stage primaryStage)  {
			try{
				this.primaryStage = primaryStage;
				this.primaryStage.setTitle("My GitHub Profile");
				this.primaryStage.setX(400);
				this.primaryStage.setY(200);

				primaryStage.show();
				
				initRootLayout();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		public void initRootLayout() {
			try {
				// Load root layout from fxml file.
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(Map.class.getResource("vista/Profile.fxml"));
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
		
		public void Main(String[] args) {
			launch(args);
		

			
		}
}