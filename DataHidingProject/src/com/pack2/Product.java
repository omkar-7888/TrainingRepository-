package com.pack2;

public class Product {
	private int Productid;
	private String Productname;
	private String Brand;
	
	
	
	public Product(int productid, String productname, String brand) {
		super();
		this.Productid = productid;
		this.Productname = productname;
		this.Brand = brand;
	}
	public int getProductid() {
		return Productid;
	}
	public void setProductid(int productid) {
		Productid = productid;
	}
	public String getProductname() {
		return Productname;
	}
	public void setProductname(String productname) {
		Productname = productname;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	@Override
	public String toString() {
		return "Product [Productid=" + Productid + ", Productname=" + Productname + ", Brand=" + Brand + "]";
	}
	
	
}
