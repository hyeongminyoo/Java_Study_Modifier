package com.iu.himart;

import com.iu.product.Product;

public class Tv extends Product {
	private String size;
	
	public Tv() {
		this.size = "100";
		this.setBrand("LG");
		this.setPrice(8000000);
		this.setPoint(200);
	}
	
	
	
	public String getSize() {
		return size;
	}



	public void setSize(String size) {
		this.size = size;
	}



	public void info() {
		super.info();
		System.out.println("size : " + this.size);
	}
	
	
}
