/**
 * This class belongs to the package project.model
 */
package co.edu.uniquindio.finalproject.model;

/**
 * This class represents to
 *
 * @author Juanes Cardona
 * @author Juan Ramírez
 * @author Jose Taborda
 */
public class PurchaseDetail {

		// Declaration of attributes 
		private String date;
		private double subtotal;
		private int amount;
		private Product product;
		private String code;
		
		
		//Getters and setters 
		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public double getSubtotal() {
			return subtotal;
		}

		public void setSubtotal(double subtotal) {
			this.subtotal = subtotal;
		}

		public int getAmount() {
			return amount;
		}

		public void setAmount(int amount) {
			this.amount = amount;
		}

		public Product getProduct() {
			return product;
		}

		public void setProduct(Product product) {
			this.product = product;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}
		
		// Method constructor
		public PurchaseDetail(String date, double subtotal, int amount, Product product, String code) {
			super();
			this.date = date;
			this.subtotal = subtotal;
			this.amount = amount;
			this.product = product;
			this.code = code;
		}
		
		//Method toString
		public String toString() {
			return "PurchaseDetail [code=" + code + "]";
		}
	
	
}
