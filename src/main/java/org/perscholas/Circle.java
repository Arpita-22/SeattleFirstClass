package org.perscholas;

public class Circle extends Shape {
	
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;	
	}
	
	public Circle() {
		this(100.0);
	}
	
	

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2.0 * Math.PI * radius;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.format("Drawing a circle of radius %.2f\r\n", radius);

	}

}
