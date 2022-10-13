package project.model;

/**
 * This class represents a administrator and inherits of the person class
 *
 * @author Jose Manuel Taborda
 * @author Juan Esteban Ramirez
 * @author Juan Esteban Cardona
 *
 */
public class Administrator extends Person
{

	/**
	 * Construct of the administrator class
	 *
	 * @param name
	 * @param lastname
	 * @param idCard
	 * @param address
	 */
	public Administrator(String name, String lastname, String idCard, String address) {
		super(name, lastname, idCard, address);
	}

}
