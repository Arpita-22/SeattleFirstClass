package org.perscholas.advancedIO;

import java.util.Arrays;
import java.util.List;

public class Calc {
	
	private int sum;
	private int numA;
	private int numB;
	
	public Calc(){
		
	}
	
	public Calc performSum(List<Integer> list) {
		
		int sum2 = 0;
		for(Integer num: list) {
			sum2 += num;
		}
		
		this.sum = sum2;
		return this;
		
	}
	
	public void displaySum() {
		System.out.println(this.sum);
		
	}
	
	
	
	public Calc numberToPerformOn(int numA, int numB) {
		this.numA = numA;
		this.numB = numB;
		return this;
		
	}
	
	public void operation(String op) {
		
		switch(op) {
		
		case "+":
			System.out.println((int)this.numA + (int)this.numB);
			break;
		case "-":
			System.out.println((int)this.numA - (int)this.numB);
			break;
		case "*":
			System.out.println((int)this.numA * (int)this.numB);
			break;
		case "/":
			System.out.println((int)this.numA / (int)this.numB);
			break;
		}
		
	}
	
	public static void main(String [] args) {
		List<Integer> num = Arrays.asList(3, 4, 3);
		
		Calc calc = new Calc();
		calc.performSum(num).displaySum();
		
		calc.numberToPerformOn(2, 3).operation("*");
		
		
	}
	
	

}
