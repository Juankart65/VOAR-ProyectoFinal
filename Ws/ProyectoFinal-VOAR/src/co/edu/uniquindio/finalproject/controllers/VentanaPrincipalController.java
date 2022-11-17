/**
 * This class belongs to the package co.edu.uniquindio.finalproject.controllers
 */
package co.edu.uniquindio.finalproject.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.finalproject.application.Aplicacion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class VentanaPrincipalController {

	// Declaracion de atributos
	private Aplicacion aplicacion;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Pane paneInformacionProducto;

    @FXML
    private Tab tabFriendRequest;

    @FXML
    private TextField txtCategoria;

    @FXML
    private Tab tabOther;

    @FXML
    private Tab tabPost;

    @FXML
    private Tab tabUser;

    @FXML
    private Button btnCrearPublicación;

    @FXML
    private Button btnComprar;

    @FXML
    private Button btnCerrarSesion;


    @FXML
    private TextField txtNombreProducto;

    @FXML
    private TextField txtPrecio;

    @FXML
    void CrearPublicacionEvent(ActionEvent event) {
    	crearPostAction();
    }

    /**
	 *
	 */
	private void crearPostAction() {
		aplicacion.mostrarVentanaCrearPost();

	}

	@FXML
    void ComprarProductoEvent(ActionEvent event) {

    }

    @FXML
    void CerrarSesionEvent(ActionEvent event) {
    	cerrarSesionAction();
    }


    /**
	 *
	 */
	private void cerrarSesionAction() {
		aplicacion.mostrarVentanaInicioSesion();

	}

	@FXML
    void initialize() {

    }

	/**
	 * @param aplicacion
	 */
	public void setAplicacion(Aplicacion aplicacion) {
		this.aplicacion = aplicacion;

	}

}
