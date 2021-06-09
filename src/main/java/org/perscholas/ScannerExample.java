package org.perscholas;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a no");
		double d = input.nextDouble();
		System.out.println(d);
		input.close();
	}

}
