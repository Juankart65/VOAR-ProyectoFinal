package co.edu.uniquindio.finalproject.model;

/**
 * This class represents a person
 *
 * @author Jose Manuel Taborda
 * @author Juan Esteban Ramirez
 * @author Juan Esteban Cardona
 *
 */
public abstract class Person {

	// Atribute Declaration

	private String name;
	private String lastname;
	private String idCard;
	private String address;

	/**
	 * Constructor of the person class
	 */
	public Person(String name, String lastname, String lastame,String  idCard, String address) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.idCard = idCard;
		this.address = address;
	}
	
	

	/**
	 * 
	 */
	

	public Person() {
	}



	/**
	 * Get the name of the person
	 *
	 * @return
	 */
	public String getName() {
		return name;
	}

	

	/**
	 * Set the name of the person
	 *
	 * @param nombre
	 */
	public void setName(String nombre) {
		this.name = nombre;
	}

	/**
	 * Get the lastname of the person
	 *
	 * @return
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * Set the lastname of the person
	 *
	 * @param apellidos
	 */
	public void setLastname(String apellidos) {
		this.lastname = apellidos;
	}

	/**
	 * Get the person's ID
	 *
	 * @return
	 */
	public String getIdCard() {
		return idCard;
	}

	/**
	 * Set the person's ID
	 *
	 * @param cedula
	 */
	public void setIdCard(String cedula) {
		this.idCard = cedula;
	}

	/**
	 * Get the address of the person
	 *
	 * @return
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Set the address of the person
	 *
	 * @param direccion
	 */
	public void setAddress(String direccion) {
		this.address = direccion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idCard == null) ? 0 : idCard.hashCode());
		return result;
	}

	/**
	 * This method campares if two people are equals
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (idCard == null) {
			if (other.idCard != null)
				return false;
		} else if (!idCard.equals(other.idCard))
			return false;
		return true;
	}

	/**
	 * This method converts class attributes to string
	 */
	@Override
	public String toString() {
		return "Persona [nombre=" + name + ", apellidos=" + lastname + ", cedula=" + idCard + ", direccion="
				+ address + "]";
	}

}
