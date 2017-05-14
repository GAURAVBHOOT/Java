package com.techm.inheritance;

public class Base {
	int x;

	
	
	public Base(int x) {
		
		this.x = x;
		System.out.println("I am base para");
	}

	public Base() {
		
		x=0;
		System.out.println("I am base class default");
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	
	

}
