package com.gb;

import java.util.Scanner;

public class AssignmentDayOne3 {

	public static void main(String[] args) {
		int a;
		int b;
		String c;
		int d;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		c=in.next();
		if (c.equals("*")){
			d=a*b;
			System.out.println("Operation is : " +d);
		}
		if (c.equals("+")) {
			d=a+b;
			System.out.println("Operation is : " +d);
		}
		if (c.equals("-")) {
			d=a-b;
			System.out.println("Operation is : " +d);
			
		}
		if (c.equals("/")) {
			d=a/b;
			System.out.println("Operation is : " +d);
			
		}
	}

}
