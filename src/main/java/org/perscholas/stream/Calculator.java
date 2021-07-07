package org.perscholas.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calcExpression("Monday");

	}
	
	public static void calcExpression(String ex) {
		List<String> expression = Arrays.asList(ex.split(""));
		IntStream.range(0, expression.size()).forEach(System.out::println);
	
	}

}
