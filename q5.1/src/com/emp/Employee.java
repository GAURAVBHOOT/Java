package com.emp;

public abstract class Employee {

	public int empId;
	public String empName;
	DateOfJoin dateOfJoining;
	public double basicSal;
	
	public Employee(int empId, String empName, DateOfJoin dateOfJoining,
			double basicSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dateOfJoining = dateOfJoining;
		this.basicSal = basicSal;
	}
	
	protected void showDetails(){
		System.out.println("Employee [empId=" + empId + ", empName=" + empName
				+ ", basicSal=" + basicSal + "]");
	}

	protected abstract void calcSal();
	
}
