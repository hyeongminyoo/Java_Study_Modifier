package com.iu.util;

import java.util.Scanner;

public class CollectionSet implements Collection {
	Scanner sc = new Scanner(System.in);
	//3.com.iu.util.CollectionSet
	// add - 새로운 숫자 추가 마지막에 추가
	// 		 단, 중복되지않는 숫자만 추가
	// remove - 삭제할 숫자를 입력받아서 일치하는 숫자를 삭제
	// collectionStack.add -> {1,2,3,4} or {1,2,3} ex)4추가
	// collection.remove ->			
	@Override
	public int[] add(int[] numbers) {
		System.out.println("추가할 숫자 입력");
		int num = sc.nextInt();
		
		int[] numbersCopy = new int[(numbers.length+1)];
		int j = 0;
		for(int i=0; i<numbers.length;i++) {
			numbersCopy[j] = numbers[i];
			j++;
		}
		for(int i = 0; i<numbers.length; i++) {
			if(numbers[i] == num) {
				return numbers;
			}else {
				numbersCopy[numbers.length] = num;
			}
		}

		return numbersCopy;
	}
	
	@Override
	public int[] remover(int[] numbers) {
		System.out.println("삭제할 숫자 입력");
		int num = sc.nextInt();
		
		int[] numbersCopy = new int[(numbers.length-1)];
		int j = 0;
		for(int i = 0 ; i<numbers.length; i++) {
			if(numbers[i] == num) {
				i++;
			}
			numbersCopy[j] = numbers[i];
			j++;
		}
		return numbersCopy;
	}
}
