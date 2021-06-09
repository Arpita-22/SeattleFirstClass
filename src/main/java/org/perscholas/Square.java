package org.perscholas;

public class Square extends Rectangle {
//	public static void main(String [] args) {
//		
//	}
	
	public Square() {
		super();
	}
	
	public Square(double widthAndHeight) {
		super(widthAndHeight, widthAndHeight);
	}
	
	@Override
	
	public void setWidth(double newWidth) {
		super.setWidth(newWidth);
		super.setHeight(newWidth);
		
	}
	
	@Override
	public void setHeight(double newHeight) {
		super.setWidth(newHeight);
		super.setHeight(newHeight);
		
	}
	
	@Override
	
	public void draw() {
		System.out.format("Drawing a %.2f  X %.2f Square \r\n", getHeight(), getWidth());
	}

}
