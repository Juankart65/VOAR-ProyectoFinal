package project.exceptions;

/**
 * This class represents the exceptions of the sale class
 *
 * @author Jose Manuel Taborda
 * @author Juan Esteban Ramirez
 * @author Juan Esteban Cardona
 *
 */
public class SaleException extends Exception {

	/**
	 * This is the class id
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Contruct of the SaleException class
	 *
	 * @param message
	 */
	public SaleException(String message){
		super(message);
	}
}
