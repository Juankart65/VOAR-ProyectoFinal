package co.edu.uniquindio.finalproject.model;

import java.util.ArrayList;

/**
 * This class represents a sale
 *
 * @author Jose Manuel Taborda
 * @author Juan Esteban Ramirez
 * @author Juan Esteban Cardona
 *
 */
public class Sale {

	// Declaration of attributes
	private ArrayList<Product> product = new ArrayList<Product>();
	private PurchaseDetail salesDetail;
	private double total;
	private String code;
	private SalesPerson salesPerson;

	// Getters and setters
	public ArrayList<Product> getProduct() {
		return product;
	}

	public void setProduct(ArrayList<Product> product) {
		this.product = product;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public PurchaseDetail getSalesDetail() {
		return salesDetail;
	}

	public void setSalesDetail(PurchaseDetail salesDetail) {
		this.salesDetail = salesDetail;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public SalesPerson getSalesPerson() {
		return salesPerson;
	}

	public void setSalesPerson(SalesPerson salesPerson) {
		this.salesPerson = salesPerson;
	}

	// Method constructor
	public Sale(ArrayList<Product> product, PurchaseDetail salesDetail, double total, String code,
			SalesPerson salesPerson) {
		super();
		this.product = product;
		this.salesDetail = salesDetail;
		this.total = total;
		this.code = code;
		this.salesPerson = salesPerson;
	}

	// Method toString
	public String toString() {
		return "Sale [code=" + code + "]";
	}
	


}
