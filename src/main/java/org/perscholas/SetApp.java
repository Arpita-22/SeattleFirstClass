package org.perscholas;

import java.util.ArrayList;
import java.util.TreeSet;

public class SetApp {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		uniqueValuesExample();

	}
	
	private static void  uniqueValuesExample() {
		ArrayList<Integer> values = new ArrayList<>(100);
		
		for(int i = 0 ; i < 100; i++) {
			int v = 1 + (int)(Math.random()* 50);
			values.add(v);
		}
		System.out.println(values);
		TreeSet<Integer> set = new TreeSet<>(values);
		System.out.println();
		System.out.println(set);
//		TreeSet<Integer> set = new TreeSet<>();
		set.addAll(values);
		System.out.println();
		System.out.println(set);
		System.out.printf("Of %d values, %d are unique", values.size(), set.size());
		
	}

}
