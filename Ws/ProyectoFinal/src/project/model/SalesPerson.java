package project.model;

import java.util.ArrayList;

/**
 * This class represents a salesperson and inherits from the person class
 *
 * @author Jose Manuel Taborda
 * @author Juan Esteban Ramirez
 * @author Juan Esteban Cardona
 *
 */
public class SalesPerson extends Person {

	// Attribute Declaration

	private Profile profile;
	private ArrayList<Sale> salesList = new ArrayList<Sale>();
	private ArrayList<Purchase> shoppingList = new ArrayList<Purchase>();

	/**
	 * Constructor of the salesperson class
	 *
	 * @param nombre
	 * @param apellidos
	 * @param cedula
	 * @param direccion
	 */
	public SalesPerson(String nombre, String apellidos, String cedula, String direccion) {
		super(nombre, apellidos, cedula, direccion);
	}

	/**
	 * Get salesperson profile
	 *
	 * @return
	 */
	public Profile getProfile() {
		return profile;
	}

	/**
	 * Set salesperson profile
	 *
	 * @param feed
	 */
	public void setProfile(Profile feed) {
		this.profile = feed;
	}

	/**
	 * Get the sales list
	 *
	 * @return
	 */
	public ArrayList<Sale> getSalesList() {
		return salesList;
	}

	/**
	 * Set the sales list
	 *
	 * @param listaVentas
	 */
	public void setSalesList(ArrayList<Sale> listaVentas) {
		this.salesList = listaVentas;
	}

	/**
	 * get the shopping list
	 *
	 * @return
	 */
	public ArrayList<Purchase> getShoppingList() {
		return shoppingList;
	}

	/**
	 * Set the shopping list
	 *
	 * @param listaCompras
	 */
	public void setShoppingList(ArrayList<Purchase> listaCompras) {
		this.shoppingList = listaCompras;
	}

}
