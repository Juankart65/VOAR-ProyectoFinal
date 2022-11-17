package co.edu.uniquindio.finalproject.model;

/**
 * This class represents a administrator and inherits of the person class
 *
 * @author Jose Manuel Taborda
 * @author Juan Esteban Ramirez
 * @author Juan Esteban Cardona
 *
 */
public class Administrator extends Person {

	// Declaracion de atributos
	private String user;
	private String password;

	/**
	 * Construct of the administrator class
	 *
	 * @param name
	 * @param lastname
	 * @param idCard
	 * @param address
	 */
	public Administrator(String name, String lastname, String idCard, String address, String user, String password) {
		super(name, lastname, idCard, address);
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Administrator other = (Administrator) obj;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Administrator [user=" + user + ", password=" + password + "]";
	}


}
