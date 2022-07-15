package com.iu.terran;

import com.iu.unit.Unit;

public class Marine extends Unit {
	

	private String weapon;
	
	public Marine() {
		super(30); 
		System.out.println("Marine 생성자");
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	
	//오버라이딩
	public void move() {
		super.info(); //부모의 영역을 참조한것
		System.out.println("뛰어다님");
	}
	
	//선언한것 자체도 오버라이딩 한것
	public void info() {
		System.out.println("Marine info");
	}
	
	public void shoot() {
		System.out.println("우다다닫");
	}
	

}
