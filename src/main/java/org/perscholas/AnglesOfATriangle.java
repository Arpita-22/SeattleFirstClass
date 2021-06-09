package org.perscholas;

import java.util.*;

public class AnglesOfATriangle {

	public static void main(String [] args) {
		
//		System.out.println(Math.acos(0.4));
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter X1");
		
		double x1 = input.nextDouble();

		
		System.out.println("Enter Y1");
		double Y1 = input.nextDouble();
		
		System.out.println("Enter X2");
		double x2 = input.nextDouble();
		
		System.out.println("Enter Y2");
		
		double Y2 = input.nextDouble();
	
		
		System.out.println("X3");
		
		double x3 = input.nextDouble();

		
		System.out.println("Y3");
		
		double Y3 = input.nextDouble();
		
		input.close();
		
		double a = Math.sqrt(Math.pow((x2 - x1),2)+ Math.pow((Y2 - Y1), 2));
		double b = Math.sqrt(Math.pow((x3 - x2),2)+ Math.pow((Y3 - Y2), 2));
		double c = Math.sqrt(Math.pow((x3 - x1),2)+ Math.pow((Y3 - Y1), 2));
		
//		 System.out.println(a);
//		 System.out.println(b);
//		 System.out.println(c);
		 
//		 System.out.println((a * (a-b) * (b-c) * c) / (-2 * b * c));
		
		//from java math slides
		double A = Math.toDegrees(Math.acos((a * a-b * b-c * c) / (-2 * b * c)));
	    double B = Math.toDegrees(Math.acos((b * b-a * a-c * c) / (-2 * a * c)));
	    double C = Math.toDegrees(Math.acos((c * c-b * b-a * a) / (-2 * a * b)));
		
	    System.out.println(A);
	    System.out.println(B);
	    System.out.println(C);
	}

}
