/**
 * This class belongs to the package co.edu.uniquindio.finalproject.application
 */
package co.edu.uniquindio.finalproject.application;

import java.io.IOException;

import co.edu.uniquindio.finalproject.controllers.VentanaPrincipalController;
import co.edu.uniquindio.finalproject.model.App;
import javafx.application.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * This class represents to
 *
 * @author Juanes Cardona
 */
public class Aplicacion extends Application {

	// Attribute Declaration
	private Stage primaryStage;
	App app = new App("V.O.A.R");

	/*
	 * (non-Javadoc)
	 *
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 */
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("V:O:A:R");
		mostrarVentanaPrincipal();

	}

	/**
	 *
	 */
	private void mostrarVentanaPrincipal() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Aplicacion.class.getResource("../views/VentanaPrincipalView.fxml"));

			AnchorPane rootLayout = (AnchorPane) loader.load();

			VentanaPrincipalController ventanaPrincipalController = loader.getController();
			ventanaPrincipalController.setAplicacion(this);

			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

}
