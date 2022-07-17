package com.iu.main;

import com.iu.util.CollectionQue;
import com.iu.util.CollectionSet;
import com.iu.util.CollectionStack;

public class Main {

	public static void main(String[] args) {
		//test data set
		int [] nums = {1,2,3};
		
//		CollectionStack collectionStack = new CollectionStack();
//		nums = collectionStack.add(nums);
//		for(int i=0 ; i<nums.length; i++) {
//			System.out.println(nums[i]);
//		}
//		System.out.println("제거");
//		nums = collectionStack.remover(nums);
//		for(int i=0 ; i<nums.length; i++) {
//			
//			System.out.println(nums[i]);
//		}
		
//		CollectionQue collectionQue = new CollectionQue();
//		nums = collectionQue.add(nums);
//		for(int i=0 ; i<nums.length; i++) {
//			
//			System.out.println(nums[i]);
//		}
//		
//		nums = collectionQue.remover(nums);
//
//		System.out.println("제거");
//		for(int i=0 ; i<nums.length; i++) {
//			
//			System.out.println(nums[i]);
//		}
		
		CollectionSet collectionSet = new CollectionSet();
//		nums = collectionSet.add(nums);
//		for(int i=0 ; i<nums.length; i++) {
//			
//			System.out.println(nums[i]);
//		}
		
		nums = collectionSet.remover(nums);

		for(int i=0 ; i<nums.length; i++) {
			
			System.out.println(nums[i]);
		}
		
		
		
		
		//1.com.iu.util.CollectionStack
			// add - 입력받은 새로운 숫자 추가 무조건 0 번 인덱스에 추가
			// remove - 0번 인덱스 삭제
			// collectionStack.add -> {4,1,2,3} ex)4추가
			// collection.remove -> {2,3}
		
		//2.com.iu.util.CollectionQue
			// add - 입력받은 새로운 숫자 무조건 0 번에 추가
			// remove - 마지막 인덱스 번호 삭제
			// collectionQue.add -> {4,1,2,3} ex)4추가
			// collection.remove -> {1,2}				
				
		//3.com.iu.util.CollectionSet
			// add - 새로운 숫자 추가 마지막에 추가
			// 		 단, 중복되지않는 숫자만 추가
			// remove - 삭제할 숫자를 입력받아서 일치하는 숫자를 삭제
			// collectionStack.add -> {1,2,3,4} or {1,2,3} ex)4추가
			// collection.remove ->			
		
	}

}
