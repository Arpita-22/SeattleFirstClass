package org.perscholas;

public class RectangleApp {

	public static void main(String[] args) {
//		Rectangle bigRect = new Rectangle(500, 250);
//		Rectangle defaultRect = new Rectangle();
//
//		System.out.println(bigRect.getHeight());
//		System.out.println(bigRect.getWidth());
//		System.out.println(bigRect.height);
//		
//		System.out.println( defaultRect.getHeight());
//		System.out.println( defaultRect.getWidth());
		
//		Square square = new Square();
//		System.out.printf("Width: %.2f  Height: %.2f%n", square.getHeight(), square.getWidth());
//		
//		square.setWidth(300.0);
//		System.out.printf("Width: %.2f  Height: %.2f%n", square.getHeight(), square.getWidth());
//		
//		Rectangle rect = new Square(250.0);
//		rect.setWidth(350.0);
//		System.out.printf("Width: %.2f  Height: %.2f%n",rect.getHeight(), rect.getWidth());
		
//		Shape shape  = new Shape();
//		Circle cir = new Circle();
		
		Shape [] shapes = new Shape[3];
		shapes[0] = new Circle(50.0);
		shapes[1] = new Rectangle(200.0, 90.0);
		shapes[2] = new Square(25.0);
		
		for(Shape s: shapes) {
			s.draw();
		}
		
	}

}
