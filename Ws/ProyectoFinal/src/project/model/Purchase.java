package project.model;

import java.util.ArrayList;

/**
 * This class represents a purchase
 *
 * @author Jose Manuel Taborda
 * @author Juan Esteban Ramirez
 * @author Juan Esteban Cardona
 *
 */
public class Purchase {
	
	
		//Declaration of attributes
		private ArrayList<Product> producto = new ArrayList<Product>() ;
		private PurchaseDetail purchaseDetail;
		private double total;
		private String code;
		
		//Getters and setters 
		public ArrayList<Product> getProducto() {
			return producto;
		}

		public void setProducto(ArrayList<Product> producto) {
			this.producto = producto;
		}

		public PurchaseDetail getPurchaseDetail() {
			return purchaseDetail;
		}

		public void setPurchaseDetail(PurchaseDetail purchaseDetail) {
			this.purchaseDetail = purchaseDetail;
		}

		public double getTotal() {
			return total;
		}

		public void setTotal(double total) {
			this.total = total;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}
		
		//Method constructor  
		public Purchase(ArrayList<Product> producto, PurchaseDetail purchaseDetail, double total, String code) {
			super();
			this.producto = producto;
			this.purchaseDetail = purchaseDetail;
			this.total = total;
			this.code = code;
		}
		
		//Method toString 
		public String toString() {
			return "Purchase [code=" + code + "]";
		}

		
}
