package com.iu.util;

import java.util.Scanner;

public class CollectionStack implements Collection {

	Scanner sc = new Scanner(System.in);
	@Override
	public int[] add(int[] numbers) {
		System.out.println("추가할 숫자 입력");
		int num = sc.nextInt();
		
		int[] numbersCopy = new int[(numbers.length+1)];
		numbersCopy[0] = num;
		int j = 1;
		for(int i=0; i<numbers.length;i++) {
			numbersCopy[j] = numbers[i];
			j++;
		}
		
		return numbersCopy;
	}
	@Override
	public int[] remover(int[] numbers) {
		int [] numbersCopy = new int[numbers.length-1];
		int j = 0;
		for(int i=0; i<numbers.length;i++) {
			if(i==0) {
				j++;
			}
			numbersCopy[j] = numbers[i];
		}
		
		return numbers;
	}
}
