package project.exceptions;

/**
 * This class represents the exceptions of the post class
 *
 * @author Jose Manuel Taborda
 * @author Juan Esteban Ramirez
 * @author Juan Esteban Cardona
 *
 */
public class PostException extends Exception {

	/**
	 * This is the class id
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Contruct of the PostException class
	 *
	 * @param message
	 */
	public PostException(String message){
		super(message);
	}
}
