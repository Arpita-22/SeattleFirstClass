package org.perscholas.stream;

import java.util.stream.Stream;

public class StreamEx1 {

	public static void main(String[] args) {
//		Stream.of("a1", "a2","a3")
//		.findFirst()
//		.ifPresent(System.out::println);

		Stream.of("d2", "a2","b1", "b3", "c")
		.filter(s ->{System.out.println("filter:" + s);
			return true;})
		.forEach(System.out::println);
		
		Stream.of("d2", "a2","b1", "b3", "c")
		.map(s -> {
			System.out.println("map:" + s);
			return s.toUpperCase();
			})
		
		.filter(s ->{
			System.out.println("filter:" + s);
			return s.startsWith("A");
			})
		
		.forEach(System.out::println);
		
	
	
//	Stream.of("d2", "a2","b1", "b3", "c")
//	
//	.filter(s ->{
//		System.out.println("filter:" + s);
//		return s.startsWith("a");
//		})
//	
//	.map(s -> {
//		System.out.println("map:" + s);
//		return s.toUpperCase();
//		})
//	
//	.forEach(System.out::println);
	
}

}
