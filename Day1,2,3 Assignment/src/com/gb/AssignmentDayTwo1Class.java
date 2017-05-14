package com.gb;

public class AssignmentDayTwo1Class {
	private int bookNo;
	private String title;
	private String author;
	private float price;
	private static  int bookCount;
	

	public static int getBookCount() {
		return bookCount;
	}
	
	static{
		bookCount=0;
	}
	public static void setBookCount(int bookCount) {
		AssignmentDayTwo1Class.bookCount = bookCount;
	}
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
			
	
	
	
	public AssignmentDayTwo1Class(int bookNo, String title, String author,
			float price) {
		if(title.length()>=4){
			if(price>=1||price<=5000){
				this.bookNo = bookNo;
				this.title = title;
				this.author = author;
				this.price = price;
				bookCount++;
			}
		}
		else{
			System.out.println("Not Valid");
		}
		
	}
	public AssignmentDayTwo1Class() {
		bookCount++;
	}
	@Override
	public String toString() {
		return bookNo+" "+title+" "+" "+author+" "+price;
	}
}



