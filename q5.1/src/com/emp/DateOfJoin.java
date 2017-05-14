package com.emp;

public class DateOfJoin {
	
	public int day;
	public int month;
	public int year;
	
	public DateOfJoin(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void showDate(){
		System.out.println("DateOfJoin [day=" + day + ", month=" + month + ", year=" + year
				+ "]");
	}

	@Override
	public String toString() {
		return "DateOfJoin [day=" + day + ", month=" + month + ", year=" + year
				+ "]";
	}
	
	

	
	
}
