package com.d;

import java.util.Scanner;

import com.bill.Customer;
import com.bill.PremiumCustomer;
import com.bill.RegularCustomer;

public class TestClient {

	public static void main(String[] args) {
		Customer arr[]=new Customer[2];
		Scanner sc=new Scanner(System.in);
		
		PremiumCustomer pc=new PremiumCustomer(1, "abc"	, 1234, 101);
		RegularCustomer rc=new RegularCustomer(2, "pqr", 4321, 201);
	
		pc.calculateBill(40);
		rc.calculateBill(30);
		
		arr[0]=pc;
		arr[1]=rc;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		

	}

}
