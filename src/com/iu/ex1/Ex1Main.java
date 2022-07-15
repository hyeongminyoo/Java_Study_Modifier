package com.iu.ex1;

public class Ex1Main {

	public static void main(String[] args) {
		
		//객체만드는 형식 : 디자인패턴
		//싱글톤 ( 디자인 패턴, MVC2) 
		
		//지역변수는 초기화하지 않으면 사용 불가능
//		Iu iu;
		//클래스 메서드 호출
		//getInstance 메서드 = 객체만들어서 리턴해주는것 , 생성자가 private로 되어있음
		Iu iu = Iu.getInstance();
		iu.setName("iu");
		iu.setAge(30);
		
		String name = iu.getName();
		
		
		System.out.println(name);
		System.out.println(iu.getAge());
		System.out.println(iu);
		System.out.println("=================");
		
		Iu iu2 = Iu.getInstance();
		
		System.out.println(iu2.getName());
		System.out.println(iu2.getAge());
		System.out.println(iu2);
		
		
		
	}

}
