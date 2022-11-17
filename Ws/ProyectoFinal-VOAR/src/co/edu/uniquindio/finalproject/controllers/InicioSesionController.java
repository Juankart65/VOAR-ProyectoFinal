package co.edu.uniquindio.finalproject.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.finalproject.application.Aplicacion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class InicioSesionController {

	// Declaracion de variables
	private String user;
	private String password;
	private Aplicacion aplicacion;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnLogin;

    @FXML
    private TextField txtUser;

    @FXML
    private CheckBox chkUser;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private Label txtAlert;

    @FXML
    void IniciarSesionEvent(ActionEvent event) {
    	iniciarSesionAction();
    }

    private void iniciarSesionAction() {
    	if(txtUser.getText().equals(user) && txtPassword.getText().equals(password)){
			txtPassword.setText("");
			txtUser.setText("");
			aplicacion.mostrarVentanaPrincipal();
		} else {
			txtAlert.setText("Usuario y/o contraseņa incorrectos");

		}


	}

	@FXML
    void initialize() {
    	user = "root";
    	password = "root";
    }

	public void setAplicacion(Aplicacion aplicacion) {
		this.aplicacion = aplicacion;
	}
}

