package com.gb;

import java.util.Scanner;

public class AssignmentDayTwo1Main {

	public static void main(String[] args) {
		AssignmentDayTwo1Class book=new AssignmentDayTwo1Class(1,"abcd","b1",100); 
		AssignmentDayTwo1Class book1=new AssignmentDayTwo1Class(2,"abdc","p1",200);
		AssignmentDayTwo1Class book2=new AssignmentDayTwo1Class();
		EngineeringBooks book3=new EngineeringBooks(5, "Morris", "Mano", 400, "Engineering");
		Scanner in=new Scanner(System.in);
		
		/*System.out.println("Enter book number : ");
		int a=in.nextInt();
		book2.setBookNo(a);
		System.out.println("Enter book title : ");
		String b=in.next();
		book2.setTitle(b);
		System.out.println("Enter author : ");
		String c=in.next();
		book2.setAuthor(c);
		System.out.println("Enter book cost : ");
		int d=in.nextInt();
		book2.setPrice(d);*/
		/*System.out.println("Enter book ID");
		int e=in.nextInt();
		if(e==book.getBookNo()){
			System.out.println(book.getTitle()+" "+book.getAuthor()+" "+book.getPrice());
		}
		if(e==book1.getBookNo()){
			System.out.println(book1.getTitle()+" "+book1.getAuthor()+" "+book1.getPrice());
		}*/
		
		/*AssignmentDayTwo1Class arr[]={book,book1,book2};
		System.out.println(book);
		System.out.println(book1);
		System.out.println(book2);
		
		System.out.println("Bookcount : "+book.getBookCount());
		*/		
		System.out.println(book3);
	}

}
