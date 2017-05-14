package com.gb;

public class EmpArray {

	public static void main(String[] args) {
		Employee emp1=new Employee(123, "ABC", 200, 20);
		Employee emp2=new Employee(132,"pqr",300,30);
		
		emp1.calculate();;
		
		emp2.calculate();;
		
		Employee arr[]={emp1,emp2};
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Details " + arr[i]);
			
		}
		
	}

}
