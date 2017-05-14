package com.vehicle.test;

import com.vehicle.*;

public class TestVehicle {

	public static void main(String[] args) {
		
		Vehicle veh=new Car(1234, true, "Gas");
		Car cr=(Car)veh;
		veh.ignite();
		veh.changeGear(1);
		
		cr.showCarDetails();
		
		veh.stop();
		
		
		
		cr.showCarDetails();
	}

}
