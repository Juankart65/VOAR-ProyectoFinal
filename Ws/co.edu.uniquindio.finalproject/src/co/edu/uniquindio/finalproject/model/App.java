package co.edu.uniquindio.finalproject.model;

import java.util.ArrayList;

import co.edu.uniquindio.finalproject.exceptions.PersonException;

/**
 * This is the main class
 *
 * @author Jose Manuel Taborda
 * @author Juan Esteban Ramirez
 * @author Juan Esteban Cardona
 *
 */
public class App {

	private ArrayList<SalesPerson> salesPersonList = new ArrayList<SalesPerson>();
	private Administrator administrator;
	private SalesPerson userAct;
	private String name;

	/**
	 * @param salesPersonList
	 * @param administrator
	 * @param userAct
	 */
	public App(ArrayList<SalesPerson> salesPersonList, Administrator administrator, SalesPerson userAct) {
		super();
		this.salesPersonList = salesPersonList;
		this.administrator = administrator;
		this.userAct = userAct;
	}

	/**
	 * Construct with name
	 *
	 * @param name
	 */
	public App(String name) {
		super();
		this.name = name;
	}

	/**
	 * get name
	 *
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * set name
	 *
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get salesPersonList
	 *
	 * @return the salesPersonList
	 */
	public ArrayList<SalesPerson> getSalesPersonList() {
		return salesPersonList;
	}

	/**
	 * Set salesPersonList
	 *
	 * @param salesPersonList
	 *            the salesPersonList to set
	 */
	public void setSalesPersonList(ArrayList<SalesPerson> salesPersonList) {
		this.salesPersonList = salesPersonList;
	}

	/**
	 * Get administrator
	 *
	 * @return the administrator
	 */
	public Administrator getAdministrator() {
		return administrator;
	}

	/**
	 * Set administrator
	 *
	 * @param administrator
	 *            the administrator to set
	 */
	public void setAdministrator(Administrator administrator) {
		this.administrator = administrator;
	}

	/**
	 * Get userAct
	 *
	 * @return the userAct
	 */
	public SalesPerson getUserAct() {
		return userAct;
	}

	/**
	 * Set userAct
	 *
	 * @param userAct
	 *            the userAct to set
	 */
	public void setUserAct(SalesPerson userAct) {
		this.userAct = userAct;
	}

	// CRUD SALESPERSON

	/**
	 * this method create a salesPerson
	 *
	 * @param newSalesPerson
	 * @return
	 */
	public String createSalesPerson(SalesPerson newSalesPerson) {
		String message = "";
		boolean checkSalesPerson;
		try {
			checkSalesPerson = checkPerson(newSalesPerson.getIdCard());
			if (checkSalesPerson == false) {
				salesPersonList.add(newSalesPerson);
				message = "salesPerson created successfully";
			}
		} catch (PersonException e) {
			message = e.getMessage();
		}
		return message;
	}

	/**
	 * this method ckeck if salesPerson exist
	 *
	 * @param idCard
	 * @return
	 */
	private boolean checkPerson(String idCard) throws PersonException {
		boolean check = false;
		boolean flag = false;
		for (SalesPerson salesPerson : salesPersonList) {
			if (flag == false && salesPerson.getIdCard().equals(idCard)) {
				check = true;
				flag = true;
				throw new PersonException("salesPerson exist");
			}
		}
		return check;
	}

	/**
	 * this method get a salesPerson by name
	 *
	 * @param name
	 * @return
	 * @throws PersonException
	 */
	public SalesPerson getSalesPerson(String name) throws PersonException {
		SalesPerson salesPersonFound = null;
		boolean flag = false;
		for (SalesPerson salesPerson : salesPersonList) {
			if (salesPerson != null && flag == false && salesPerson.getName().equals(name)) {
				salesPersonFound = salesPerson;
				flag = true;
			}
		}
		if (salesPersonFound == null) {
			throw new PersonException("salesPerson no found");
		}

		return salesPersonFound;
	}

	/**
	 * this mthod update a salesPerson
	 *
	 * @param newSalesPerson
	 * @return
	 * @throws PersonException
	 */
	public String updateSalesPerson(SalesPerson newSalesPerson) throws PersonException {
		String message = "";
		SalesPerson salesPersonFound = null;
		boolean flag = false;
		for (SalesPerson salesPerson : salesPersonList) {
			if (flag == false && salesPerson.getIdCard().equals(newSalesPerson.getIdCard())) {
				salesPersonFound = salesPerson;
				flag = true;

				salesPersonFound.setAddress(newSalesPerson.getAddress());
				salesPersonFound.setIdCard(newSalesPerson.getIdCard());
				salesPersonFound.setLastname(newSalesPerson.getLastname());
				;
				salesPersonFound.setName(newSalesPerson.getName());

				message = "salesPerson updated successfully";
			}
		}
		if (salesPersonFound == null) {
			throw new PersonException("SalesPerson don�t exist");
		}
		return message;
	}

	/**
	 * this method delete a salesPerson by idCard
	 *
	 * @param idCard
	 * @return
	 */
	public String deleteSalesPerson(String idCard) {

		String message = "";
		SalesPerson salesPersonFound = null;
		boolean flag = false;

		try {
			salesPersonFound = getSalesPerson(idCard);
			for (SalesPerson salesPerson : salesPersonList) {
				if (salesPerson != null && flag == false && salesPerson == salesPersonFound) {
					salesPerson = null;
					flag = true;
					message = "salesPerson deleted successfully";
				}
			}
		} catch (PersonException e) {
			message = e.getMessage();
		}

		return message;
	}

}
