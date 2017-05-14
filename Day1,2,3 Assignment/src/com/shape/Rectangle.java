package com.shape;

public class Rectangle implements Polygon {
	float length;
	float breadth;
	
	
	public Rectangle(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public void calcArea() {
		System.out.println("Area of rectangle is : "+length*breadth);
		
	}

	@Override
	public void calcPeri() {
		System.out.println("Peri of rectangle is : "+2*(length+breadth));
		
	}
	

}
