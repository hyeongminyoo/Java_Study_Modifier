package com.iu.util;

import java.util.Scanner;

public class CollectionQue implements Collection {
	
	Scanner sc = new Scanner(System.in);
	@Override
	public int[] add(int[] numbers) {
		System.out.println("추가할 숫자 입력");
		int num = sc.nextInt();
		
		numbers[0] = num;
		
		return numbers;
	}
	
	public int[] remover(int[] numbers) {
		int [] numbersCopy = new int[numbers.length-1];
		int i = 0;
		for(i=0; i<numbers.length;i++) {
			if(i==numbers.length) {
				break;
			}
			numbersCopy[i] = numbers[i];
		}
		
		return numbersCopy;

	}
}
