package demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Test {

	public static void main(String[] args) {
		File f=new File("d:\\NumberFile.txt");
		if(args.length==5){
			if (f.exists()) {
				try {
					PrintWriter pw=new PrintWriter(new FileOutputStream(f, true));
					for (int i = 0; i < args.length; i++) {
						pw.println(args[i]);
						
					}
					pw.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			} else {
				try {
					f.createNewFile();
					PrintWriter pw=new PrintWriter(new FileOutputStream(f, true));
					for (int i = 0; i < args.length; i++) {
						pw.println(args[i]);
						
					}
					pw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				

			}
				
				
			}
			
		
		else {
			try {
				throw new FiveNumberNotPresent("Enter five numbers : ");
			} catch (FiveNumberNotPresent e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			FileReader fr=new FileReader(f);
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
