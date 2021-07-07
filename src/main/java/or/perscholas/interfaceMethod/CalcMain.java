package or.perscholas.interfaceMethod;

import java.util.Arrays;
import java.util.Scanner;

public class CalcMain {

	public static void main(String[] args) {
		
		MyCalc mycalc = new MyCalc();
		
			
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter an expression: 2+2");	
		String expr1 = input.nextLine();	
//		String [] expr = expr1.split(" ");

		String operator1 = "";
		String [] expr2 = new String [2];
		
		if(expr1.contains("+")) {
			
			operator1 = "+";
			expr2 = expr1.split("\\+");
			
		}else if(expr1.contains("-")) {
			
			operator1 = "-";
			expr2 = expr1.split("\\-");
			
		}else if(expr1.contains("*")) {
			
			operator1 = "*";
			expr2 = expr1.split("\\*");
			
		}else if(expr1.contains("/")) {
			
			operator1 = "/";
			expr2 = expr1.split("\\/");
		}
		
		System.out.println(operator1);
		System.out.println(Arrays.toString(expr2));
		
		
		

		

		
//		char operator = expr[1].charAt(0);
		
	
		
		switch(operator1){
		
		case "+":
			
			System.out.println(mycalc.sum.compute(Integer.parseInt(expr2[0]), Integer.parseInt(expr2[1])));
			break;
			
		case "-":
			
			System.out.println(mycalc.subtract.compute(Integer.parseInt(expr2[0]), Integer.parseInt(expr2[1])));
			break;
			
		case "*":
			
			System.out.println(mycalc.multiply.compute(Float.parseFloat(expr2[0]), Float.parseFloat(expr2[1])));
			break;
			
		case "/":
			
			System.out.println(mycalc.divide.compute(Float.parseFloat(expr2[0]), Float.parseFloat(expr2[1])));
			break;
			
		}
		input.close();
			
	}

}
