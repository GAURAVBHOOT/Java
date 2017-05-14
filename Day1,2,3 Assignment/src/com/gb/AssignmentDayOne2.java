package com.gb;

import java.util.Scanner;

public class AssignmentDayOne2 {

	public static void main(String[] args) {
		int sum=0;
		int avg=0;
		System.out.print("Enter size of array : ");
		Scanner in=new Scanner(System.in);
		int Size=in.nextInt();
		int arr[]=new int[Size];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter the number " + (i+1) + ":");
			int a=in.nextInt();
			sum+=a;
			avg=sum/arr.length;
			
			
			
		}
		System.out.println("Sum : "+sum);
		System.out.println("Average : "+avg);

	}

}
