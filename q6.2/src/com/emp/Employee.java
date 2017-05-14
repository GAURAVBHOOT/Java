package com.emp;

import java.io.Serializable;

public class Employee implements Serializable {
	
	public int empId;
	public String empName;
	public int deptNo;
	
	public Employee(int empId, String empName, int deptNo) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.deptNo = deptNo;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", deptNo=" + deptNo + "]";
	}
	
	

}
