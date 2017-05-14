package q4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteEmployee {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("How many employees : ");
		int i=sc.nextInt();
		File f=new File("d:\\emp.txt");
		
		for (int j = 0; j < i; j++) {
			
		
		    System.out.print("Enter employee number : ");
			int empNo=sc.nextInt();
			System.out.print("Enter employee name : ");
			String empName=sc.next();
			System.out.print("Enter employee basic : ");
			int empBasic=sc.nextInt();
			Employee emp=new Employee(empNo,empName,empBasic);
			
		
			
			
			try {
				//FileWriter fw = new FileWriter(f,true);
				//BufferedWriter bw  = new BufferedWriter(fw);
				PrintWriter pw = new PrintWriter((new FileOutputStream(f,  true )));
				pw.append(emp.toString());
				pw.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		try {
			FileReader fr=new FileReader(f);
			BufferedReader br=new BufferedReader(fr);
			String s=null;
			
			while((s=br.readLine())!= null){
				System.out.println(s);
			}
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

