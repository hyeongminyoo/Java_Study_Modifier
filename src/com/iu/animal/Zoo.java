package com.iu.animal;

public class Zoo {
	
	//멤버 변수 선언 
	//접근지정자 [그외지정자] 데이터 타입 변수명
	//클래스 변수
	public static String title = "사파리"; 
	
	//인스턴스변수
	public final int PRICE = 50000; //변경 불가능 , 두단어 이상 합쳐지면 snake 표현 ( ex . MAX_VALUE)
	
	//멤버메서드 선언
	//접근지정자 [그외지정자] 리턴 타입 메서드명([매개변수 선언]){}
	//클래스메서드
	public static void info() {
		System.out.println("Static Method");
		System.out.println(Zoo.title);
		//System.out.println(price); 객체생성을 하지않았으므로 오류
//		getPrice(); 객체생성을 하지않았으므로
	}
	
	//인스턴스메서드
	public void getPrice() {
		System.out.println(PRICE);
		System.out.println(Zoo.title);
		Zoo.info();
	}
	
	
	
}
