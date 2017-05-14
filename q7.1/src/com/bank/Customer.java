package com.bank;

import java.util.Set;
import java.util.TreeSet;

public class Customer  {
	
	private int custNo;
	private String custName;
	private int custPhone;
	
	TreeSet<Account> ts=new TreeSet<Account>();

	
	
	public Customer(int custNo, String custName, int custPhone) {
		super();
		this.custNo = custNo;
		this.custName = custName;
		this.custPhone = custPhone;
		
	}

	public void addNewAccount(Account a1) {
		ts.add(a1);
	}
	
	public TreeSet getAccountList() {
		for (Account account : ts) {
			System.out.println(account);
		}
		return null;
	}
	
	public void printBal(String ano) {
		for (Account account : ts) {
			if(account.getAccountNumber().equals(ano)){
				System.out.println("Balance : "+account.getAccountBalance());
			}
		}
	}

	@Override
	public String toString() {
		return "Customer [custNo=" + custNo + ", custName=" + custName
				+ ", custPhone=" + custPhone + ", ts=" + ts + "]";
	}

	
	

}
