package com.emp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class StoreEmployee {

	public static void main(String[] args) {
		File f=new File(args[0]);
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter how many employees you want to enter : ");
		int e=sc.nextInt();
		Employee emp1;
		for (int i = 0; i < e; i++) {
			System.out.print("Enter employee ID : ");
			int eid=sc.nextInt();
			System.out.print("Enter employee name : ");
			String ename=sc.next();
			System.out.print("Enter department number : ");
			int dno=sc.nextInt();
			
			Employee emp=new Employee(eid, ename, dno);
			
			try {
				FileOutputStream fos=new FileOutputStream(f, true);
				ObjectOutputStream oos=new ObjectOutputStream(fos);
				oos.writeObject(emp);
				oos.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			
		}
		
		for (int i = 0; i < e; i++) {
			
			try {
				FileInputStream fis=new FileInputStream(f);
				ObjectInputStream ois=new ObjectInputStream(fis);
				emp1=(Employee)ois.readObject();
				System.out.println(emp1);
				ois.close();
				
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		
		
		
		
	}

}
