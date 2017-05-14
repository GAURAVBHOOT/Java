package com.gb;

public class Sal {

	public static void main(String[] args) {
		
		Employee e=new Employee();
		
		e.setEmpid(1001);
		e.setEname("ABC");
		e.setSal(200000);
		
		e.setHRA(100);
		e.calculate();
		
		Employee e1=new Employee();
		
		e1.setEmpid(1002);
		e1.setEname("ABCD");
		e1.setSal(20000);
		
		e1.setHRA(100);
		e1.calculate();
		
		int eid=e.getEmpid();
		
		System.out.println("Employee ID : " + eid);
		
		String enm=e.getEname();
		
		System.out.println("Employee Name : " + enm);
		
		int sl=e.getSal();
		
		System.out.println("Salary is : " + sl);
	
		int t=e.getTotal();
		
		System.out.println("Total salary is : " + t);

	
	
		int ei=e1.getEmpid();
		
		System.out.println("Employee ID : " + ei);
		
		String em=e1.getEname();
		
		System.out.println("Employee Name : " + em);
		
		int slr=e1.getSal();
		
		System.out.println("Salary is : " + slr);
	
		int tt=e1.getTotal();
		
		System.out.println("Total salary is : " + tt);

	}

}
