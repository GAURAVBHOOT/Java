package Q3;

import java.util.Scanner;

public class TestCustomer {

	public static void main(String[] args)    {
		String a,b,c;
		
		Scanner in=new Scanner(System.in);
		System.out.print("Enter customer id : ");
		a=in.next();
		System.out.print("Enter customer name : ");
		b=in.next();
		System.out.print("Enter customer category : ");
		c=in.next();
		
		Customer obj=new Customer(a, b, c);
		
		System.out.println("Customer id : "+ obj.getCustNo());
		System.out.println("Customer Name : "+obj.getCustName());
		System.out.println("Customer category : "+obj.getCategory());

	}

}
