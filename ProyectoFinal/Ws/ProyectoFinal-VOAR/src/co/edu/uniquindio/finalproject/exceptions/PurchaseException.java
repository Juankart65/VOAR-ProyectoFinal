package co.edu.uniquindio.finalproject.exceptions;

/**
 * This class represents the exceptions of the purchase class
 *
 * @author Jose Manuel Taborda
 * @author Juan Esteban Ramirez
 * @author Juan Esteban Cardona
 *
 */
public class PurchaseException extends Exception {

	/**
	 * This is the class id
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Contruct of the PurchaseException class
	 *
	 * @param message
	 */
	public PurchaseException(String message){
		super(message);
	}
}
