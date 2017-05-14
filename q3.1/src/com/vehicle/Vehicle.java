package com.vehicle;

public abstract class Vehicle {
	
	public int vehicleNo;
	public String engineStatus;
	public int currentGear;
	
	
	
	public Vehicle(int vehicleNo) {
		
		
		this.vehicleNo = vehicleNo;
		
		
	}
	
	public abstract void ignite();
	public abstract int changeGear(int flag);
	public abstract void stop();
	
}
