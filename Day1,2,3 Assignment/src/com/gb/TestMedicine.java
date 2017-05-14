package com.gb;

import java.util.Random;

public class TestMedicine {

	public static void main(String[] args) {
		int temp;
		Medicine arr[]=new Medicine[5];
		
		for (int i = 0; i < arr.length; i++) {
			temp = new Random().nextInt(3)+1;
			System.out.println(temp);
			switch (temp) {
			case 1:
				arr[i]=new Tablet();
				arr[i].displayLabel();
				
				break;
			case 2:
				arr[i]=new Syrup();
				arr[i].displayLabel();
			   
				break;
			case 3:
				arr[i]=new Ointment();
				arr[i].displayLabel();
				
			

			default:
				break;
			}
			
			
			}
		
		
	}

}
