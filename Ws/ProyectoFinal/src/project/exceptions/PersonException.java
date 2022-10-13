package project.exceptions;

/**
 * This class represents exceptions for classes the inherit from the person class
 *
 * @author Jose Manuel Taborda
 * @author Juan Esteban Ramirez
 * @author Juan Esteban Cardona
 *
 */
public class PersonException extends Exception {

	/**
	 * This is the class id
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Contruct of the PersonException class
	 *
	 * @param message
	 */
	public PersonException(String message){
		super(message);
	}
}
