package com.techm.inheritance;

public class DriverMain {

	public static void main(String[] args) {
		//Derived obj1=new Derived();
		//Derived obj2=new Derived(10);
	
		TechMahindra tm=new TechMahindra(1001,"Biksa",200000,"Pune");
		System.out.println(tm.getEmpID()+" "+tm.getEname()+" "+tm.getSal()+" "+tm.getLocation());
	}

}
