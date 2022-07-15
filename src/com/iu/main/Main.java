package com.iu.main;

import com.iu.himart.Client;
import com.iu.himart.Computer;
import com.iu.himart.Phone;
import com.iu.himart.Tv;

public class Main {

	public static void main(String[] args) {
		Computer computer = new Computer();
		
		Phone phone = new Phone();
		
		Tv tv = new Tv();
		phone.info();
		computer.info();
		tv.info();
		
		Client client = new Client();
		client.buy(phone);
		
		
		
	}

}
