package com.techm.bank;

public class Account {

	protected int accID;
	private String accName;
	private int amount;
	
	
	
	
	public Account(String accName, int amount) {
		super();
	
		this.accName = accName;
		this.amount = amount;
	}
	
	
	
	public int getAccID() {
		return accID;
	}
	public void setAccID(int accID) {
		this.accID = accID;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	
	
}
