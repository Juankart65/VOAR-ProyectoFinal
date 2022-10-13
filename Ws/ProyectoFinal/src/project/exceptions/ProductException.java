package project.exceptions;

/**
 * This class represents the exceptions of the product class
 *
 * @author Jose Manuel Taborda
 * @author Juan Esteban Ramirez
 * @author Juan Esteban Cardona
 *
 */
public class ProductException extends Exception {

	/**
	 * This is the class id
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Contruct of the ProductException class
	 *
	 * @param message
	 */
	public ProductException(String message){
		super(message);
	}
}
