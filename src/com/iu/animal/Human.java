package com.iu.animal;

public class Human {
	
	private int age;
	
	//get으로 시작하는 메서드는 데이터를 꺼내오는 메서드 getter 메서드
	public int getAge() {
		return this.age;
	}
	
	//set으로 시작하는 메서드 데이터를 입력하는 메서드 setter 메서드
	public void setAge(int age) {
		this.age=0;
		if(age>=0 && age<=150) {
			this.age=age;
		}
//		if(age>=0 && age<=150) {
//			this.age = age;
//		}else {
//			this.age = 0;
//		}
	}
	
	public void info() {
		System.out.println(this.age);
	}
	
	public void myPet() {
		//Cat cat = new Cat();
		//cat.age=10;
		//cat.sound();
	}
}
