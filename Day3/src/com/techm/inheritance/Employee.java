package com.techm.inheritance;

public class Employee {
	
	private int empID;
	private String ename;
	private int sal;
	
	public Employee(int empID, String ename, int sal) {
		super();
		this.empID = empID;
		this.ename = ename;
		this.sal = sal;
	}
	
	public Employee() {
		super();
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}
	
	
	

}
