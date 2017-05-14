package com.shape;

public class Square implements Polygon {
	float side;

	
	public Square(float side) {
		super();
		this.side = side;
	}

	@Override
	public void calcArea() {
		System.out.println("Area is : "+ side*side);
		
	}

	@Override
	public void calcPeri() {
		System.out.println("Peri is : "+4*side);
		
	}
	
}
