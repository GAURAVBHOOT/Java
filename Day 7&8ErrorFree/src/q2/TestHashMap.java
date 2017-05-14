package q2;

import java.util.Scanner;

public class TestHashMap {

	public static void main(String[] args) {
		Student a=new Student();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter key and name : ");
		
		String b=in.next();
		String c=in.next();
		String d=in.next();
		String e=in.next();
		
		a.setNames(b, c);
		
		a.setNames(d, e);
		
		a.printNames();
		
		a.printNamesKeySet();
		
		a.getNames(d);
		
		a.sizeHash();
		
		a.remove(d);

	}

}
