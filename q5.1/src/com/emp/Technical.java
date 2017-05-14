package com.emp;

public class Technical extends Employee {
	
	public String jobDesc;
	public String grade;
	
	
	public Technical(int empId, String empName, DateOfJoin dateOfJoining,double basicSal, String jobDesc, String grade) {
		super(empId, empName, dateOfJoining, basicSal);
		this.jobDesc = jobDesc;
		this.grade = grade;
		calcSal();
	}


	@Override
	protected void calcSal() {
		double total=basicSal+(0.1*basicSal);
		System.out.println("Total salary : "+total);

	}
	
	@Override
	protected void showDetails(){
		System.out.println("Employee [empId=" + empId + ", empName=" + empName
				+ ", basicSal=" + basicSal + ", jobDesc="+jobDesc+", grade="+grade+ "]");
	}


	@Override
	public String toString() {
		return "Technical [jobDesc=" + jobDesc + ", grade=" + grade
				+ ", empId=" + empId + ", empName=" + empName
				+ ", dateOfJoining=" + dateOfJoining + ", basicSal=" + basicSal
				+ "]";
	}
	
	

}
