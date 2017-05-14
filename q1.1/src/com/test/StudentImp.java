package com.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import com.student.*;

public class StudentImp {

	public static void main(String[] args) {
		Student stu=new Student();
		
		stu.readStudInfo();
		stu.calcTotal();
		stu.printStudInfo();
		
		File f=new File("d:\\StudentInfo.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			PrintWriter pw = new PrintWriter(f);
			pw.println(stu);
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br=new BufferedReader(fr);
			
			String s=null;
			
			while ((s=br.readLine())!=null) {
				System.out.println(s);
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
