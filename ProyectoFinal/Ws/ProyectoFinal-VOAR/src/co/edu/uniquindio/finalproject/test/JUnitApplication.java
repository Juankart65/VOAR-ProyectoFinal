/**
 * This class belongs to the package project.test
 */
package co.edu.uniquindio.finalproject.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import co.edu.uniquindio.finalproject.model.App;
import co.edu.uniquindio.finalproject.model.SalesPerson;

/**
 * This class represents to
 *
 * @author Jose Manuel Taborda
 * @author Juan Esteban Ramirez
 * @author Juan Esteban Cardona
 */
public class JUnitApplication {

	// Attribute Declaration

	App app = new App("");

	@Before
	public void beforeTo() {

	}

	/**
	 * This test verifies if the method to create a seller is working correctly.
	 * As the list of users is empty at this point, the method should say that
	 * the user was created correctly, if the message is different, the method
	 * is working badly.
	 */
	@Test
	public void createSalesPerson() {
		SalesPerson person1 = new SalesPerson("Juan", "Reyes", "1234567", "Armenia");
		String message = app.createSalesPerson(person1);

		if (!message.equals("salesPerson created successfully")) {
			Assert.fail("Error");
		}
		System.out.println(message);
	}

	/**
	 * This test verifies if the method to create a seller is working correctly.
	 * The method should say that the user exist, if the message is different,
	 * the method is working badly.
	 */
	@Test
	public void createSalesPerson2() {
		SalesPerson person2 = new SalesPerson("Juan", "Reyes", "1234567", "Armenia");
		String message = app.createSalesPerson(person2);

		if (!message.equals("salesPerson exist")) {
			Assert.fail("Error");
		}
		System.out.println(message);
	}
}
