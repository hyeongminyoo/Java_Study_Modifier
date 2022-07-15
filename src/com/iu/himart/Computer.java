package com.iu.himart;

import com.iu.product.Product;

public class Computer extends Product{
	private String cpu;
	
	public Computer() {
		this.cpu = "M2";
		this.setBrand("MacMini");
		this.setPrice(2000000);
		this.setPoint(100);
	}
	
	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public void info() {
		super.info();
		System.out.println(this.cpu);
	}
}
