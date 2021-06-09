package org.perscholas;

import java.util.Scanner;

public class ChineseZodiac {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a year:");
		int year = input.nextInt();
		input.close();
		String output = "";
		
		switch(year % 12){
			case 0:
				output = "monkey";
				break;
			case 1:
				output = "rooster";
				break;
			case 2:
				output = "dog";
				break;
			case 3:
				output = "pig";
				break;
			case 4:
				output = "rat";
				break;
			case 5:
				output = "ox";
				break;
			case 6:
				output = "tiger";
				break;
			case 7:
				output = "rabbit";
				break;
			case 8:
				output = "dragon";
				break;
			case 9:
				output = "snake";
				break;
			case 10:
				output = "horse";
				break;
			case 11:
				output = "sheep";
				break;
			
		}
		
		System.out.println(output);
	}

}
