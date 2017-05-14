package com.gb;

import java.util.Arrays;

public class AssignmentDayOne5 {

	public static void main(String[] args) {
		String temp;
		String arr1[] = new String[5];
		String arr[]={"Hello","Bye","Hi","fry","jry"};
		for (int i = 0; i < arr.length; i++) {
			temp=new StringBuffer(arr[i]).reverse().toString();
			System.out.println(temp);
			arr1[i]=temp;	
		}
		System.out.println("++++++++++++++");
		Arrays.sort(arr1);
		for (int j = 0; j < arr.length; j++) {
			
			System.out.println(arr1[j]);
		}
		
		}
		
			
		}
	


