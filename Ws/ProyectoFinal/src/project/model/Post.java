package project.model;

import java.util.ArrayList;

/**
 * This class represents a post
 *
 * @author Jose Manuel Taborda
 * @author Juan Esteban Ramirez
 * @author Juan Esteban Cardona
 *
 */
public class Post {

	// Attribute Declaration

	private String description;
	private Product product;
	private ArrayList<Reaction> reactionList = new ArrayList<Reaction>();

	/**
	 * Construct of the post class
	 *
	 * @param description
	 * @param product
	 * @param reactionList
	 */
	public Post(String description, Product product, ArrayList<Reaction> reactionList) {
		super();
		this.description = description;
		this.product = product;
		this.reactionList = reactionList;
	}

	/**
	 * Get post description
	 *
	 * @return
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Set post description
	 *
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Get the product
	 *
	 * @return
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * Set the product
	 *
	 * @param product
	 */
	public void setProduct(Product product) {
		this.product = product;
	}

	/**
	 * Get the reaction list
	 * @return
	 */
	public ArrayList<Reaction> getReactionList() {
		return reactionList;
	}

	/**
	 * Set the reaction list
	 *
	 * @param reactionsList
	 */
	public void setReactionList(ArrayList<Reaction> reactionsList) {
		this.reactionList = reactionsList;
	}

}
