package com.iu.main;

import com.iu.terran.Marine;
import com.iu.terran.Scv;
import com.iu.unit.Unit;
import com.iu.zerg.Hydra;

public class Main {

	public static void main(String[] args) {
		//자식 객체를 만들면 부모 객체부터 생성함
		Marine m1 = new Marine();
		Scv s1 = new Scv();
		//Marine is a Unit
		//Scv is a Unit
		
		Unit unit = m1; // 슈퍼클래스에 자식클래스를 대입은 타입 변환 필요없음
		Hydra hydra = new Hydra();
		
		m1.attack();
		hydra.attack();
		
		
		
		System.out.println(unit.getHp());
		System.out.println(unit.getColor());
		System.out.println(unit.getName());
		
		//자식클래스에 슈퍼클래스를 대입하는것은 강제 형변환하는것처럼 Unit 타입을 Marine 타입으로 
		m1 = (Marine)unit;
		
		System.out.println(m1.getWeapon());
		
		//Marine type is a Unit Type
		
		m1.setHp(30);
//		Unit unit = Unit(); Class 앞에 abstract가 붙었으므로 객체생성 불가능 , 추상 클래스는 무조건 상속하여 사용
		
		m1.info();
		m1.move();
		
	}

}