package com.validate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LoginValidate {

	public static void main(String[] args) {
		
		File f=new File("d:\\login.txt");
		if (args.length==2) {
			if(f.exists()){
				try {
					FileReader fr=new FileReader(f);
					BufferedReader br=new BufferedReader(fr);
					String s=null;
					while ((s=br.readLine())!=null) {
						String c[]=s.split(",");
						if(c[0].equals(args[0]) && c[1].equals(args[1])){
							System.out.println("Login succesfull");
							
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
			else {
				System.out.println("File does not exists");
			}
		}
		else {
			System.out.println("login validate");
		}
		
		
	}

}
