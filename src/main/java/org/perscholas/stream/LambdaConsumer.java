package org.perscholas.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LambdaConsumer {

	public static void main(String[] args) {
		List<String> names1 = new ArrayList<>(Arrays.asList("a", "b", "c","d"));
//		
//		
//		
////		//All the three produces same result
////		names.forEach(name -> System.out.println(name));
////		System.out.println();
////		
////		//the double colon is called method reference
//		   names1.forEach(System.out::println);
//		   System.out.println();
////		
////		names.stream().forEach(System.out::println);
////		System.out.println();
////		
////		for(String name: names) {
////			System.out.println(name);
////		}
//		
//		Stream<String> stream = names1.stream();
////		
//// both gives the same result line 31 and 32	
//		
////	long count = stream.map(v -> {return v.toUpperCase();}).count();
//		long count = names1.stream().map(String::toUpperCase).count();
//		long count = stream.map(String::toUpperCase).count();
//		System.out.println();
//		
//		System.out.println(count);
//		
//		List<String> nums = new ArrayList<>(Arrays.asList("one", "two", "three"));
//		Stream<String> stream2 = nums.stream();
//		
////	Stream<String> longStringsStream = stream2.filter(v -> {return v.length() > 3;});
//		Stream<String> longStringsStream = stream2.filter(v -> v.length() > 3);
//		longStringsStream.forEach(System.out::println);
//		

		List<String> names = new ArrayList<>(Arrays.asList("Larry", "Steve", "James","Conan", "Ellen"));
		
		names.stream()
		.filter(s -> s.startsWith("C") || s.startsWith("S"))
		.map(String::toUpperCase)
		.sorted()
		.forEach(System.out::println);
		
		
		List<String>  exp =  Arrays.asList("Hello".split(""));
		
		IntStream.range(0, exp.size()).forEach(System.out::println);	
		

	}

}
