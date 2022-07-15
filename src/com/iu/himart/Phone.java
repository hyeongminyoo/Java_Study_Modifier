package com.iu.himart;

import com.iu.product.Product;

public class Phone extends Product{
	private String company;
	
	public Phone() {
		this.company = "삼성";
		this.setBrand("갤럭시");
		this.setPoint(50);
		this.setPrice(1000000);
	}
	
	
	public void info() {
		super.info();
		System.out.println("Company : " + this.company);
	}
}
