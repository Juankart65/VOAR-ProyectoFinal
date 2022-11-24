/**
 * This class belongs to the package co.edu.uniquindio.finalproject.model
 */
package co.edu.uniquindio.finalproject.model;

import java.util.Objects;

/**
 * This class represents to
 *
 * @author Juanes Cardona
 */
public class User {

	private String nombreUsuario;
	private String contrasenia;

	/**
	 *
	 * @param nombreUsuario
	 * @param contrasenia
	 */
	public User(String nombreUsuario, String contrasenia) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.contrasenia = contrasenia;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(contrasenia, nombreUsuario);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(contrasenia, other.contrasenia) && Objects.equals(nombreUsuario, other.nombreUsuario);
	}

}
