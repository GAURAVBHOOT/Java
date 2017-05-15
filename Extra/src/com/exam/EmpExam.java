package com.exam;

import java.util.Scanner;

import com.emp.Employee;
import com.emp.ExamBooking;
import com.emp.ExamDetails;
import com.emp.InvalidInputException;

public class EmpExam {

	public static void main(String[] args) throws InvalidInputException {
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		ExamBooking eb = new ExamBooking();
		ExamDetails ed = new ExamDetails();
		System.out.print("Enter employee name : ");
		String ename = sc.next();
		System.out.print("Enter employee department : ");
		String eDept = sc.next();
		Employee emp1 = new Employee(ename, eDept);
		System.out.print("Enter exam code : ");
		String excode = sc.next();

		//ed.init();
		//ed.Display();
		//eb.searchExam(excode);

		eb.addBooking(ename, excode);

		eb.examBooking(ename);

	}

}
