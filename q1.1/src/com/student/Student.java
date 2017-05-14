package com.student;

import java.util.Scanner;

public class Student implements StudentInt {
	
	private int rollNo;
	private String name;
	private int subject1;
	private int subject2;
	private int subject3;
	private int totalMarks;
	
	@Override
	public void readStudInfo() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter roll number : ");
		this.rollNo=sc.nextInt();
		System.out.print("Enter name : ");
		this.name=sc.next();
		System.out.print("Enter subject 1 marks : ");
		this.subject1=sc.nextInt();
		System.out.print("Enter subject 2 marks : ");
		this.subject2=sc.nextInt();
		System.out.print("Enter subject 3 marks : ");
		this.subject3=sc.nextInt();

	}

	@Override
	public void calcTotal() {
		this.totalMarks=this.subject1+this.subject2+this.subject3;
		

	}

	@Override
	public void printStudInfo() {
		System.out.println("Roll number : "+rollNo+"  Name : "+name+"  Subject 1 : "+subject1+"  Subject 2 : "+subject2+"  Subject 3 : "+subject3+"  Total : "+totalMarks);
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", subject1="
				+ subject1 + ", subject2=" + subject2 + ", subject3="
				+ subject3 + ", totalMarks=" + totalMarks + "]";
	}
	
	

}
