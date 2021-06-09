package org.perscholas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IterationStatementsLoops {
	
	public static void main(String [] args){
//		sentinalValue();
//		repeatAddition();
//		guessNum();
//		advancedMathTool();
		multiplicationTable();
	}
	
	public static void sentinalValue(){
		Scanner input = new Scanner(System.in);
		int s = -1;
		int sum = 0;
		while(s != 0) {
			System.out.println("Please enter a number or enter 0 to quit");
			s = input.nextInt();
			sum += s;
		}
		input.close();
		System.out.println(sum);
		System.out.println("Thank you for playing, You quit");
			
	}
	
	
	
	
	public static void repeatAddition(){
		Scanner input = new Scanner(System.in);
		int intS = -1;
		int sum = 0;
	
		while(intS == (int)intS){
			int num1 = 1 + (int)(Math.random()*100);
			int num2 = 1 + (int)(Math.random()*100);	
			sum = num1 + num2;
			System.out.printf("What is %d + %d%n", num1, num2);
			try {
				intS = input.nextInt();		
			}catch(InputMismatchException e) {
				System.out.println("Not a number");
				break;
			}

			if(sum == intS) {
				System.out.println("correct answer!");
			}else {
				System.out.println("try again!");
			}
			
		}
		input.close();
		
	}
	
	
	public static void guessNum(){
		Scanner input = new Scanner(System.in);
		String s = "y";
		int i = -1;
		int num = 0;
			while(num < 101){
				num = (int)(Math.random()*101);
//				num = 6;
				System.out.println("Guess the num");
				i = input.nextInt();
				
				if(i == 101) {
					break;
				}
				if(i > num){
					System.out.println("Number too high");
				}
				else if(i < num) {
					System.out.println("Number too low");
				}
				else{
					System.out.println("Congratulations, you guessed the number!");
					System.out.println("would you like to play again press y to continue or 101 to quit");
					s = input.next();

				}
		
				if(s == "y"){
					continue;
				}		
			}
			input.close();
			System.out.println("You quit");
			
	}
	
	public static void advancedMathTool(){
		int count = 0;
		int noOfproblems = 5;
		Scanner input = new Scanner(System.in);
		int sub;
		int ans = 10;
		int i = 0;
		while(i < 5){
			int num1 = 1+(int)(Math.random()* 10);
			int num2 = 1+(int)(Math.random()* 10);
			sub = num1 - num2;
			
			System.out.printf("What is %d - %d ?", num1, num2);
			ans = input.nextInt();
			
			if(sub == ans) {
				count += 1;
			}
			i++;							
		}
		input.close();	
		System.out.printf("You gave %d correct answers", count);
		
	}
	
	public static void multiplicationTable(){
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d \"  \"", i);
		}
			System.out.println("\n ________________________________________________________");
			for(int i = 1; i <= 9; i++) {
				System.out.println("");
				for(int j = 1; j <= 9; j++) {
					System.out.printf("%d \"|\"", i * j);
				}
				System.out.println();
			}
	}
	
	

}
