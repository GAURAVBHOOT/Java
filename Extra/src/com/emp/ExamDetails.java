package com.emp;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class ExamDetails {
	
HashMap<String, Integer> eDetails = new HashMap<String, Integer>();
	
	public void init() {
		eDetails.put("1ZO-148", 10000);
		eDetails.put("1ZO-061", 9000);
		eDetails.put("1ZO-803", 11000);
		eDetails.put("1ZO-899", 12000);
	}
	
	

	public ExamDetails() {
		init();
	}



	public void Display() {
		Set<Entry<String, Integer>> s=eDetails.entrySet();
		
		for (Entry<String, Integer> entry : s) {
			System.out.println(entry);
		}
	}
}
