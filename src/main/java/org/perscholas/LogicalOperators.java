package org.perscholas;

public class LogicalOperators {
	public static void main(String[]args) {
		int age = 24;
		int wt = 140;
		
		System.out.println(age > 24 ^ wt > 140);
		System.out.println(age > 24 ^ wt >= 140);
		System.out.println(age < 30 ^ wt <= 140);
		System.out.println(age >= 24 ^ wt > 140);
	}

}
