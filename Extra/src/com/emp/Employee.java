package com.emp;

public class Employee {
	private static int empId;
	private String empName;
	private String empDept;

	

	public Employee(String empName, String empDept) {
		
		this.empId = (int)Math.round(Math.random()*100);
		if (!empName.equals(null) && !empDept.equals(null)) {
			this.empName = empName;
			this.empDept = empDept;
		} else {
			try {
				throw new InvalidInputException("Invalid input");
			} catch (InvalidInputException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

	public Employee() {
		super();
	}

	public static int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public String getEmpDept() {
		return empDept;
	}
	
	

}
