package com.testemp;

import com.emp.DateOfJoin;
import com.emp.Employee;
import com.emp.Operation;
import com.emp.Technical;

public class TestEmployee {

	public static void main(String[] args) {
		Employee arr[]=new Employee[2];
		DateOfJoin doj=new DateOfJoin(1, 2, 2009);
		Operation op=new Operation(1, "abc", doj, 10000, "mag", "U");
		Technical te=new Technical(2, "pqr", doj, 20000, "tech", "P");
		arr[0]=op;
		arr[1]=te;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		

	}

}
