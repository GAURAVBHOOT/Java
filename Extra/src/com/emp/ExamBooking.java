package com.emp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map.Entry;
import java.util.Set;

public class ExamBooking {
	ExamDetails ed = new ExamDetails();
	

	public int searchExam(String ExamCode) throws InvalidInputException {
		
		try {
			System.out.println(ed.eDetails.get(ExamCode));
			return ed.eDetails.get(ExamCode);
			
		} catch (Exception e) {
			throw new InvalidInputException("Invalid Input");
		}
	}

	File f = new File("Emp_Exam.txt");

	public int addBooking(String ename, String excode) throws InvalidInputException {
		Employee emp = new Employee();
		int fee = searchExam(excode);
		int eid = Employee.getEmpId();
		String empName = ename;
		String eDept = emp.getEmpDept();

		try {
			PrintWriter pw = new PrintWriter(new FileOutputStream(f, true));
			pw.print(eid);
			pw.print(";");
			pw.print(empName);
			pw.print(";");
			pw.print(excode);
			pw.print(";");
			pw.println(fee);
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	public void examBooking(String ename) {
		
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br=new BufferedReader(fr);
			String s=null;
			while((s=br.readLine())!=null){
				String d[]=s.split(";");
				if (d[1].equals(ename)) {
					System.out.println(s);
				}
				else{
					System.out.println("Does not exists");
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
