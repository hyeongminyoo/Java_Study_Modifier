package com.iu.ex1;

public class Iu {

	private String name;
	private int age;
	//fix-study
	private String test;
	
	private static Iu iu = null; //클래스 메서드 내에서 사용 가능
	
	//Setter
	//public void set변수명(데이터타입 변수명){}
	
	//Getter
	//public return타입 get변수명(){}
	
	
	//기본생성자
	private Iu() {}
	
	
	//클래스 메서드가 됨 ( 객체 생성하지않고 사용) 
	//없으면 새로 있으면 있는주소 리턴
	public static Iu getInstance() {
		
		if(Iu.iu == null) {
			Iu.iu = new Iu();
		}
		return Iu.iu;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
