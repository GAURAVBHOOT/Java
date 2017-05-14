package com.techm.bank;

public class SavingAccount extends Account {
	
	private String branch;

	static int count=1001;
	public SavingAccount(String accName, int amount, String branch) {
		super(accName, amount);
		accID=count;
		this.branch = branch;
		count++;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	
	

}
