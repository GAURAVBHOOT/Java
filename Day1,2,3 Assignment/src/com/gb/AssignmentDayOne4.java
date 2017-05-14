package com.gb;

import java.util.Scanner;

public class AssignmentDayOne4 {

	public static void main(String[] args) {
		/*Scanner in=new Scanner(System.in);
		int num=in.nextInt();*/
		int num=Integer.parseInt(args[0]);
		System.out.println("Entered number is : " +num);
		int arr[]={10,20,30,40,50};
		for (int i = 0; i < arr.length; i++) {
			if (num==arr[i]) {
				System.out.println("Bingo");
				
			}
			else {
				System.out.println("Not matching");
			}
			
		}
 
	}

}
