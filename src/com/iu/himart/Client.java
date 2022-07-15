package com.iu.himart;

import com.iu.product.Product;

public class Client {

	private int money;
	private int point;
	
	public Client() {
		this.money = 30000000;
		this.setPoint(10);
	}
	
	public void buy(Tv tv) {
	
		this.point = this.point + tv.getPoint();
		this.money = this.money - tv.getPrice(); 
		
		System.out.println("누적 Point : " + this.point);
		System.out.println("남은 돈 : " + this.money);
		
	}
	public void buy(Computer computer) {
		
		this.point = this.point + computer.getPoint();
		this.money = this.money - computer.getPrice(); 
		
		System.out.println("누적 Point : " + this.point);
		System.out.println("남은 돈 : " + this.money);
		
	}
	public void buy(Phone phone) {
		
		this.point = this.point + phone.getPoint();
		this.money = this.money - phone.getPrice(); 
		
		System.out.println("누적 Point : " + this.point);
		System.out.println("남은 돈 : " + this.money);
		
	}
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	
	
	
}
