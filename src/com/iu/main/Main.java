package com.iu.main;

import com.iu.terran.Marine;

public class Main {

	public static void main(String[] args) {
		//자식 객체를 만들면 부모 객체부터 생성함
		Marine m1 = new Marine();
		m1.setHp(30);
//		Unit unit = Unit(); Class 앞에 abstract가 붙었으므로 객체생성 불가능 , 추상 클래스는 무조건 상속하여 사용
		
		m1.info();
		m1.move();
		
	}

}
