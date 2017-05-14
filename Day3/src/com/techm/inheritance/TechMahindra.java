package com.techm.inheritance;

public class TechMahindra extends Employee {
	
	String location;

	
	public TechMahindra() {
		super();
		
	}

	

	public TechMahindra(int empID, String ename, int sal, String location) {
		super(empID, ename, sal);
		this.location = location;
	}



	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	

}
