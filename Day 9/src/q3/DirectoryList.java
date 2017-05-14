package q3;

import java.io.File;
import java.util.Scanner;

public class DirectoryList {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter directory name : ");
		String s=sc.next();
		File f=new File(s);
		if (f.exists()) {
			String l[]=f.list();
			for (String string : l) {
				System.out.println(string);
			}
		}
		else {
			System.out.println("Directory does not exists");
		}
	}

}
