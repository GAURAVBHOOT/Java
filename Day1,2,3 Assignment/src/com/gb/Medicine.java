package com.gb;

public abstract class Medicine {
	private int price;
	private int expDate;
	public void getDetails(){
		System.out.println("Price : "+price+"Expiry date : "+expDate);
	}
	
	public abstract void displayLabel(); 
	
	

}
