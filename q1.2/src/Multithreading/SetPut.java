package Multithreading;

import java.util.ArrayList;
import java.util.Scanner;

public class SetPut {
	
	
	public static ArrayList<Item> arr=new ArrayList<Item>();
	
	
	

	public ArrayList<Item> getArr() {
		return arr;
	}

	public void setArr(ArrayList<Item> arr) {
		this.arr = arr;
	}

	public ArrayList<Item>  Set() {
		System.out.println("SET METHOD");
		
		
		Scanner sc=new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter item ID : ");
			String s=sc.next();
			System.out.print("Enter name : ");
			String n=sc.next();
			Item it=new Item(n, s);
			
			arr.add(it);
		
		}
	
			return arr;
			
		
	}

	public void put() {
		System.out.println("Hello");
		//System.out.println(arr);
		
		System.out.println(arr);
			
		
		
		
	}
}
