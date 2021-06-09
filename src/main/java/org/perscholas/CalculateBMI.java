package org.perscholas;

import java.util.Scanner;

public class CalculateBMI {
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your weight in kg");
		double wt = input.nextDouble();
		System.out.println("Enter your height in meters");
		double ht = input.nextDouble();
		input.close();
		double bmi = wt/(ht * ht);
		String output;
		
		if(bmi < 18.5){
			output = "underweight";	
		}else if(bmi >= 18.5 && bmi < 25.0){
			output = "normal";		
		}else if(bmi >= 25.0 && bmi < 30.0) {
			output = "overweight";
		}else {
			output = "obese";
		}
		
		System.out.println(output);
		
	}

}
