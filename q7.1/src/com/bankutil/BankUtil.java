package com.bankutil;

import java.util.Scanner;

import com.bank.Account;
import com.bank.Customer;

public class BankUtil {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Customer cus=new Customer(1, "abc", 1234);
		
		Account a1=new Account();
		Account a2=new Account();
		
		System.out.println("Enter acc no");
		String ano=sc.next();
		a1.setAccountNumber(ano);
		System.out.println("Enter acc bal");
		double ab=sc.nextDouble();
		a1.setAccountBalance(ab);
		System.out.println("Enter cbs");
		String cb=sc.next();
		a1.setChequeBookStatus(cb);
		cus.addNewAccount(a1);
		
		System.out.println("Enter acc no");
		String ano1=sc.next();
		a2.setAccountNumber(ano1);
		System.out.println("Enter acc bal");
		double ab1=sc.nextDouble();
		a2.setAccountBalance(ab1);
		System.out.println("Enter cbs");
		String cb1=sc.next();
		a2.setChequeBookStatus(cb1);
		cus.addNewAccount(a2);
		
		cus.getAccountList();
		
		cus.printBal("ACC101");

	}

}
