package org.perscholas;

import java.util.Scanner;

public class Loops {
	public static void main(String[]args) {
//		sentinalValue();
//		enhancedForLoops();
		multipleForLoop();
		
	}
	
	public static void sentinalValue() {
		Scanner s = new Scanner(System.in);
		
		String entry = "";
		
		while(!entry.equals("0")) {
			System.out.println("Enter a digit or 0 to quit");
			entry = s.nextLine();
		}
		s.close();
		System.out.println("you quit");
		
	}
	
	public static void enhancedForLoops() {
		int [] values = {1,2,3,4};
		for(int v: values) {
			System.out.println(v);
		}
	}
	
	
//	public static void main(String[] args) {
////		forLoop();
//		multipleForLoop();
////		semicolonAfterLoop();
////		nestedLoops();
////		whileLoop();
////		sentinalValue();
////		doWhileLoop();
//	}
//	
//	public static void forLoop() {
//		for (int i = 0; i < 5; i++) {
//			System.out.println("Hello");
//		}
//	}
//	
	public static void multipleForLoop() {
		for (int i = 0, j = 0; (i + j < 25); i++, j += 2) {
			System.out.println("i: " + i);
			System.out.println("j: " + j);
		}
	}
//	
//	public static void semicolonAfterLoop() {
//		int i = 0;
//		for ( ; i < 10; i++);
//		{
//			System.out.println("i is " + i);
//		}
//	}
//	
//	public static void nestedLoops() {
//		for (int i = 0; i < 5; ++i) {
//			for (int j = 1; j <= 2; ++j) {
//				System.out.printf("i: %d, j: %d%n", i, j);
//			}
//		}
//	}
//	
//	public static void whileLoop() {
//		int count = 0;
//		while (count < 5) {
//			System.out.println("Welcome to Java!");
//			count++;
//		}
//	}
//	
//	public static void sentinalValue() {
//		Scanner s = new Scanner(System.in);
//		String entry = "";
//		while (!entry.equals("0")) {
//			System.out.println("Please enter a digit or 0 to quit.");
//			entry = s.nextLine();
//		}
//
//		System.out.println("You have quit. Thank you for playing.");
//		
//	}
//	
//	public static void doWhileLoop() {
//		int i = 1;
//		do {
//			System.out.println(i);
//			i++;
//		} while (i < 10);
//	}
//	
//	public static void testBreak() {
//		int sum = 0;
//		int number = 0;
//		
//		while (number < 20) {
//			number++;
//			sum += number;
//			if (sum >= 100) {
//				break;
//			}
//		}
//		System.out.println("The number is " + number);
//		System.out.println("The sum is " + sum);
//	}

}
