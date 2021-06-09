package org.perscholas;

public class Switch {
	public static void main(String[] args) {
		String output;
		int grade = 80;
		
		switch(grade/10){
			case 10:
				output = "WOW!";
				break;
			case 9:
				output = "Excellent!";
				break;
			case 8:
				output = "very good!";
				break;
			case 7:
				output = "good!";
				break;
			default:
				output = "Keep trying";
				break;
		}
		
		System.out.println(output);
	}

}
