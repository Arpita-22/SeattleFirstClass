package org.perscholas;

import java.util.*;

public class StringMethods {
	
	public static void main(String [] args) {
		String PO = String.format("%.2f %d", Math.sqrt(10), 5);
		System.out.println(PO);
		System.out.printf("%.2f %d", Math.sqrt(10), 5);
		System.out.println(PO);	
		
		Scanner s = new Scanner(System.in);
		String s1 = "Apple";
		String s2 = "apple";
		
		System.out.println(s1.startsWith("App"));	
		
		System.out.println(s1.substring(2));
		
	}

}
