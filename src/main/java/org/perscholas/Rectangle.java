package org.perscholas;

public class Rectangle extends Shape{
	private double width; 
	protected double height;
	
	//other constructor
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
		
	}
	//default constructor
	public Rectangle() {
		this(100,100);
			
		}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return width * height;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2.0 * (width + height);
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.format("Drawing a %.2f  X %.2f Rectangle\r\n", height, width);

	}
	

}
