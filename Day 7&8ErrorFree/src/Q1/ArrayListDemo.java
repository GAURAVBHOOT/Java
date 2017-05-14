package Q1;

import java.util.Scanner;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter names");
		String a=in.next();
		String b=in.next();
		
		Student s=new Student();
		
		s.setNames(a);
		s.setNames(b);
		s.searchNames(a);
		s.searchName(1);
		s.printName();
	}

}
