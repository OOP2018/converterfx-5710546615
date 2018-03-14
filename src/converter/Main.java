package converter;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;

/**
 * A main class for the Converterfx. It is responsible for loading FXML and
 * showing it.
 * 
 * @author Visurt Anuttivong
 */
public class Main extends Application {

	/**
	 * Loading FXML and showing it.
	 */
	public void start(Stage stage) {
		try {
			Parent root = (Parent) FXMLLoader.load(getClass().getResource("ConverterUI.fxml"));
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.sizeToScene();
			stage.setTitle("Simple Converter");
			stage.show();
		} catch (Exception e) {
			System.out.println("Exception creating scene: " + e.getMessage());
		}
	}

	/**
	 * Launch the application.
	 * 
	 * @param args not use.
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
