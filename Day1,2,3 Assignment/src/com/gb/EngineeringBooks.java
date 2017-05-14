package com.gb;

public class EngineeringBooks extends AssignmentDayTwo1Class {
	private String category;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public EngineeringBooks(int bookNo, String title, String author,
			float price, String category) {
		super(bookNo, title, author, price);
		this.category = category;
	}
	
	

}
