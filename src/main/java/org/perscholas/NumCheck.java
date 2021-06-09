package org.perscholas;

public class NumCheck {
	public static void main(String [] args) {
		int num = 4;


		System.out.println("Is num divisible by 2 and 3 ?:" + (num % 2 == 0 && num % 3 == 0));
		System.out.println("Is num divisible by 2 or 3 ?:" + (num % 2 == 0 || num % 3 == 0));
		System.out.println("Is num divisible by 2 or 3,but not both?:" + (num % 2 == 0 ^ num % 3 == 0));
		
		int x = 1;
		
		System.out.println((x > 1) & (x++ < 10));
		System.out.println(x);
		System.out.println((1 > x) && (1 < x++));
		System.out.println(x);
		System.out.println((1 == x) || (10 > x++));
		System.out.println(x);
	}
	
}	
