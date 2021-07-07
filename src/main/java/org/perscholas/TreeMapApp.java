package org.perscholas;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;

public class TreeMapApp {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
	
//
//	import java.util.Comparator;
//	import java.util.Map;
//	import java.util.TreeMap;
//
//	/**
//	 * 
//	 * @author Charlie de la Rosa
//	 *
//	 * References:
//	 * https://www.baeldung.com/java-treemap
//	 * https://www.geeksforgeeks.org/treemap-in-java/
//	 */
//
//	public class TreeMapApp {
//		
//		public static void main(String[] args) {
//			Map<Integer, String> treeMap = new TreeMap<>();
//			treeMap.put(12, "twelve");
//			treeMap.put(4, "four");
//			treeMap.put(32, "thirty-two");
//			treeMap.put(27, "twenty-seven");
//			treeMap.put(1, "one");
//			System.out.println(treeMap.containsValue("four"));
//			System.out.println(treeMap.containsKey(27));
//			
//			for (Map.Entry<Integer, String> e: treeMap.entrySet()) {
//				System.out.printf("%s ", e.getValue());
//			}
//			
//			System.out.println();
//			
//			TreeMap<Integer, String> reverseTreeMap = new TreeMap<>(Comparator.reverseOrder());
//			reverseTreeMap.putAll(treeMap);
//			for (Map.Entry<Integer, String> e: reverseTreeMap.entrySet()) {
//				System.out.printf("%s ", e.getKey());
//			}
//		}
//	}
	
//	public static void main(String[] args) {
//		Map<Integer, String> numMap = new HashMap<>();
//		numMap.put(1, "one");
//		numMap.put(2, "two");
//		numMap.put(3, "three");
//		System.out.println(numMap.get(2));
//		numMap.put(null, "nothing");
//		System.out.println(numMap.get(null));
//		numMap.put(3, "four");
//		numMap.replace(4, "four");
//		System.out.println(numMap);
//	}
//
//
//
//
//
//	import java.util.EnumMap;
//
//	enum DayOfWeek {
//		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
//	}
//
//	public class EnumMapApp {
//		public static void main(String[] args) {
//			EnumMap<DayOfWeek, Integer> map = new EnumMap<>(DayOfWeek.class);
//			
//			map.put(DayOfWeek.SUNDAY, 25);
//			map.put(DayOfWeek.MONDAY, 30);
//			map.put(DayOfWeek.TUESDAY, 35);
//			System.out.println(map.get(DayOfWeek.SUNDAY));
//		}
//	}
	
//	public static void main(String[] args) {
//		Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
//		linkedHashMap.put(4, "four");
//		linkedHashMap.put(1, "one");
//		linkedHashMap.put(8, "eight");
//		linkedHashMap.put(5, "five");
//		System.out.println(linkedHashMap);
//	}
	
//	public static void main(String[] args) {
//		Stack<String> colors = new Stack<>();
//		colors.add("red");
//		colors.add("green");
//		colors.add("blue");
//		System.out.println(colors);
//		String poppedColor = colors.pop();
//		System.out.println(poppedColor);
//		System.out.println(colors);
//		colors.push("blue");
//		System.out.println(colors);
//	}
	
//	import java.util.Arrays;
//	import java.util.HashSet;
//	import java.util.List;
//	import java.util.Set;
//	import java.util.function.Consumer;

		
		private static Consumer<String> printUpperCase = s -> System.out.println(s.toUpperCase());
		
		public static void main(String[] args) {
			// Create a list with duplicates and print it.
			List<String> colorList = Arrays.asList("red","red","green","green","blue");
			colorList.forEach(System.out::println);
			
			System.out.println();
			
			// Convert the list to a set and print to upper case
			Set<String> colorSet = new HashSet<>(colorList);
			colorSet.forEach(printUpperCase);
			
//			setString<> treeColors = new TreeSet<>(colorList);
//			treeColors.forEach(printUpperCase);
			
			TreeSet treeColors = new TreeSet(colorList);
			System.out.println();
			treeColors.forEach(printUpperCase);
		}
}
		


