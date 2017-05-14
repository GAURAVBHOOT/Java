package q2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWrite {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter number of entries : ");
		int size=in.nextInt();
		File f=new File("d:\\data.txt");
		try {
			f.createNewFile();
			for (int i = 0; i < size; i++) {
				String s=in.next();
				String a=null;
				PrintWriter pw=new PrintWriter(new FileOutputStream(f, true));
				pw.println(s);
				pw.close();
				FileReader fr = new FileReader(f);
				BufferedReader br=new BufferedReader(fr);
				
				while((a=br.readLine())!=null){
				System.out.println(a);
				}
				fr.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		double l=f.length();
		System.out.println("Length : "+l);
	}
}
