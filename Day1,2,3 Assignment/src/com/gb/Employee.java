package com.gb;

public class Employee {
	
	private int empid;
	private String ename;
	private int sal;
	private int DA ;
	private int HRA;	
	private int Total;
	
	
	public Employee(int empid, String ename, int sal, int hRA) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.sal = sal;
		HRA = hRA;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int getTotal() {
		return Total;
	}
	
	public int getDA() {
		return DA;
	}
	
	public int getHRA() {
		return HRA;
	}
	public void setHRA(int hRA) {
		this.HRA = hRA;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
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
	
	public void calculate()
	{
		this.DA=2000;
		this.Total=this.sal+this.DA+this.HRA;
		/*if(this.sal<=30000){
			this.DA=2000;
			this.Total=this.sal+this.DA+this.HRA;
		}
		else{
			this.DA=3000;
			this.Total=this.sal+this.DA+this.HRA;
		}*/
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return empid+" "+ename+" "+sal ;
	}
}
