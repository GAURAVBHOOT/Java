package com.gb;

import java.util.Scanner;

public class AssignmentDayOne1 {

	public static void main(String[] args) {
		System.out.print("Enter maximum number : ");
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		for (int i = 2; i <=num; i+=2) {
			System.out.println("Even numbers are : "+i);
			
		}

	}

}
