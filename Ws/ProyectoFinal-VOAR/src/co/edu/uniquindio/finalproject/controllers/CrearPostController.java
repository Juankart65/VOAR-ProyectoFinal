package co.edu.uniquindio.finalproject.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.finalproject.application.Aplicacion;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CrearPostController {

	private Aplicacion aplicacion;


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnPublish;

    @FXML
    private TextField txtPrecioProducto;

    @FXML
    private TextField txtCategoria;

    @FXML
    private TextArea txtDescription;

    @FXML
    private Button btnImagen;

    @FXML
    void CargarImagenEvent(ActionEvent event) {

    }

    @FXML
    void PublicarPostEvent(ActionEvent event) {
    	publicarPostAction();
    }


    /**
	 *
	 */
	private void publicarPostAction() {
		aplicacion.mostrarVentanaPrincipal();
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
