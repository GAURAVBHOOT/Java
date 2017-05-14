package com.techm.bank;

public class CurrentAccount extends Account {
	
	private String specialFacility;
	static int count=2001; 
	
	public CurrentAccount(String accName, int amount,String specialFacility) {
		super( accName, amount);
		accID=count;
		this.specialFacility = specialFacility;
		count++;
	}

	public String getSpecialFacility() {
		return specialFacility;
	}

	public void setSpecialFacility(String specialFacility) {
		this.specialFacility = specialFacility;
	}
	
	
}
