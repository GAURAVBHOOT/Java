package q1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CopyFile {

	public static void main(String[] args) {
		File f=new File("d:\\Source.txt");
		File f1=new File(args[0]);
		try {
			if(f.exists()){
				System.out.println("File exists");
				System.out.println("Do you want to overwrite");
				Scanner in=new Scanner(System.in);
				String i;
				do{
				i=in.next();
				if(i.equals("y")){
					FileReader fr = new FileReader(f);
					BufferedReader br=new BufferedReader(fr);
					PrintWriter pw = new PrintWriter(f1);
					
					String s=br.readLine();
					
					System.out.println(s);
					pw.println(s);
					pw.close();
					
					fr.close();
				}
				
			}while(i.equals("y"));
			}
			else{
				System.out.println("Not Exists");
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
