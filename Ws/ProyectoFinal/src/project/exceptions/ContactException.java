package project.exceptions;

/**
 * This class represents the exceptions of the contact class
 *
 * @author Jose Manuel Taborda
 * @author Juan Esteban Ramirez
 * @author Juan Esteban Cardona
 *
 */
public class ContactException extends Exception {

	/**
	 * This is the class id
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Contruct of the ContactException class
	 *
	 * @param message
	 */
	public ContactException(String message){
		super(message);
	}
}
