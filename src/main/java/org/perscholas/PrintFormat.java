package org.perscholas;

public class PrintFormat {

	public static void main(String[] args) {
		int i = 1024;
		byte b = 127;
		double d = 1.232;
		double tiny = d/1000000.0;
		boolean bool = true;
		
		System.out.printf("This is an integer: %d and this is a byte: %d.%n",i, b);
		System.out.format("This is a double: %.4f and this is a tiny: %.4e.%n",d, tiny);
		System.out.printf("And this is a String: %s", "This is a String \n");

	}

}
