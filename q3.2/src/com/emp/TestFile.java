package com.emp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestFile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter number of  employees : ");
		
		int s=sc.nextInt();
		Employee arr[]=new Employee[s];
		File f=new File("d:\\empdetails.txt");
		for (int i = 0; i < arr.length; i++) {
			
			Employee emp=new Employee();
			
			System.out.print("Enter employee ID : ");
			int eid=sc.nextInt();
			emp.setEmpID(eid);
			
			System.out.print("Enter employee name : ");
			String ename=sc.next();
			emp.setEmpName(ename);
			
			System.out.print("Enter employee grade : ");
			String egrade=sc.next();
			if (egrade.equals("U1")||egrade.equals("U2")||egrade.equals("U3")||egrade.equals("U4")||egrade.equals("P1")||egrade.equals("P2")) {
				emp.setGrade(egrade);
				arr[i]=emp;
				
				
				try {
					f.createNewFile();
					PrintWriter p=new PrintWriter(new FileOutputStream(f, true));
					p.println(emp);
					p.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			else {
				try {
					throw new InvalidGradeException("Invalid Grade");
				} catch (InvalidGradeException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			
		}

		try {
			FileReader fr=new FileReader(f);
			BufferedReader br=new BufferedReader(fr);
			String s1=null;
			while ((s1=br.readLine())!=null) {
				System.out.println(s1);
				
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
