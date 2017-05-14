package com.vehicle;

public class Car extends Vehicle {
	
	public boolean powerStearing;
	public String fuelType;

	

	public Car(int vehicleNo,boolean powerStearing, String fuelType) {
		super(vehicleNo);
		if(fuelType.equals("Gas")||fuelType.equals("Petrol")||fuelType.equals("Diesel")){
		this.powerStearing = powerStearing;
		this.fuelType = fuelType;
	}
	}
	
	@Override
	public void ignite() {
		engineStatus="On";
		currentGear=1;
		

	}

	@Override
	public int changeGear(int flag) {
		if(flag==1 && currentGear<=6){
			currentGear++;
		}
		else if(flag==-1 && currentGear>=1) {
			currentGear--;
		}
		return currentGear;
	}

	@Override
	public void stop() {
		engineStatus="Off";
		currentGear=0;
		

	}
	
	
	
	
	@Override
	public String toString() {
		return "Car [powerStearing=" + powerStearing + ", fuelType=" + fuelType
				+ ", vehicleNo=" + vehicleNo + ", engineStatus=" + engineStatus
				+ ", currentGear=" + currentGear + "]";
	}

	public void showCarDetails(){
		
		System.out.println("Car [powerStearing=" + powerStearing + ", fuelType=" + fuelType
				+ ", vehicleNo=" + vehicleNo + ", engineStatus=" + engineStatus
				+ ", currentGear=" + currentGear + "]");
		
	}

}
