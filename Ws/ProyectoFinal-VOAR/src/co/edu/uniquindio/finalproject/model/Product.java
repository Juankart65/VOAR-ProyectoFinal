package co.edu.uniquindio.finalproject.model;

import java.io.File;

import javafx.scene.image.Image;

/**
 * This class represents a Product
 *
 * @author Jose Manuel Taborda
 * @author Juan Esteban Ramirez
 * @author Juan Esteban Cardona
 *
 */
public class Product {

	// Attribute Declaration

	private String name;
	private String code;
	private String img;
	private String price;
	private ProductCategory category;
	private ProductStatus status;

	/**
	 * Construct of the product class
	 *
	 * @param name
	 * @param code
	 * @param img
	 * @param price
	 * @param category
	 * @param status
	 */
	public Product(String name, String code, String img, String price, ProductCategory category, ProductStatus status) {
		super();
		this.name = name;
		this.code = code;
		this.img = img;
		this.price = price;
		this.category = category;
		this.status = status;
	}

	/**
	 * 
	 */
	public Product() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Get the name of the product
	 *
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the name of the product
	 *
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get the code of the product
	 *
	 * @return
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Set the code of the product
	 *
	 * @param code
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * Get the image of the product
	 *
	 * @return
	 */
	public String getImg() {
		return img;
	}

	/**
	 * Set the image of the product
	 *
	 * @param img
	 */
	public void setImg(String img) {
		this.img = img;
	}

	/**
	 * Get the price of the product
	 *
	 * @return
	 */
	public String getPrice() {
		return price;
	}

	/**
	 * Set the price of product
	 *
	 * @param price
	 */
	public void setPrice(String price) {
		this.price = price;
	}

	/**
	 * Get the product category
	 *
	 * @return
	 */
	public ProductCategory getCategory() {
		return category;
	}

	/**
	 * Set the product category
	 *
	 * @param category
	 */
	public void setCategory(ProductCategory category) {
		this.category = category;
	}

	/**
	 * Get product status
	 *
	 * @return
	 */
	public ProductStatus getStatus() {
		return status;
	}

	/**
	 * Set product status
	 *
	 * @param status
	 */
	public void setStatus(ProductStatus status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		return result;
	}

	/**
	 * This method compares if two products are equal
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		return true;
	}

	/**
	 * This method converts class attributes to string
	 */
	@Override
	public String toString() {
		return "Product [name=" + name + ", code=" + code + ", price=" + price + ", category=" + category + ", status="
				+ status + "]";
	}

}
