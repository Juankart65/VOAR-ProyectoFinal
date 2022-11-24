/**
 * This class belongs to the package co.edu.uniquindio.finalproject.controllers
 */
package co.edu.uniquindio.finalproject.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import co.edu.uniquindio.finalproject.application.Aplicacion;
import co.edu.uniquindio.finalproject.model.Product;
import co.edu.uniquindio.finalproject.model.ProductCategory;
import co.edu.uniquindio.finalproject.model.ProductStatus;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;

public class VentanaPrincipalController implements Initializable {

	// Declaracion de atributos
	private Aplicacion aplicacion;

	private List<Product> productos = new ArrayList<>();
	private Image image;

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private Pane paneInformacionProducto;

	@FXML
	private Tab tabFriendRequest;

	@FXML
	private GridPane grid;

	@FXML
	private ScrollPane scroll;

	@FXML
	private TextField txtCategoria;

	@FXML
	private Tab tabOther;

	@FXML
	private Tab tabPost;

	@FXML
	private Tab tabUser;

	@FXML
	private Button bttCrearPublicación;

	@FXML
	private Button bttComprar;

	@FXML
	private TextField txtNombreProducto;

	@FXML
	private TextField txtPrecio;

	@FXML
	private Button btnImg;

	@FXML
	void CrearPublicacionEvent(ActionEvent event) {

	}


	private List<Product> getData() {
		List<Product> productos = new ArrayList<>();
		Product producto;

		for (int i = 0; i < 20; i++) {
			producto = new Product();
			producto.setName("Papel");
			producto.setPrice("2000");
			producto.setCode("1234");
			producto.setCategory(ProductCategory.CLEANLINESS);
			producto.setStatus(ProductStatus.PUBLICADO);
			producto.setImg("../resource/Materiales-Una-historia-sobre-la-evolución-humana-y-los-avances-tecnológicos-Papel-papel.png");
			productos.add(producto);
		}
		return productos;
	}

	/**
	 * @param aplicacion
	 */
	public void setAplicacion(Aplicacion aplicacion) {
		this.aplicacion = aplicacion;

	}

	private void setChosenProduct(Product product) {
		txtNombreProducto.setText(product.getName());
		txtPrecio.setText(Aplicacion.CURRENCY + product.getPrice());
		
		image = new Image(getClass().getResourceAsStream(product.getImg()));
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see javafx.fxml.Initializable#initialize(java.net.URL,
	 * java.util.ResourceBundle)
	 */
	@Override
	public void initialize(URL location, ResourceBundle resource) {
		showProductosFeed();
	}
	
	public void showProductosFeed() {
		productos.addAll(getData());
		int column = 0;
		int row = 1;

		try {
			for (int i = 0; i < productos.size(); i++) {

				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(getClass().getResource("../views/item.fxml"));

				AnchorPane anchorPane = loader.load();

				ItemController itemController = loader.getController();
				itemController.setData(productos.get(i));

				if (column == 1) {
					column = 0;
					row++;
				}
				
				grid.add(anchorPane, column++, row);
				
				// set  grid width
				grid.setMinWidth(Region.USE_COMPUTED_SIZE);
				grid.setPrefWidth(Region.USE_COMPUTED_SIZE);
				grid.setMaxWidth(Region.USE_PREF_SIZE);
				
				// set  grid Height
				grid.setMinHeight(Region.USE_COMPUTED_SIZE);
				grid.setPrefHeight(Region.USE_COMPUTED_SIZE);
				grid.setMaxHeight(Region.USE_PREF_SIZE);
				
				GridPane.setMargin(anchorPane, new Insets(10));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
