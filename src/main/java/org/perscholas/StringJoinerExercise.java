package org.perscholas;

import java.util.StringJoiner;

public class StringJoinerExercise {

	public static void main(String[] args) {
		StringJoiner joinNames = new StringJoiner(",","[","]");
		
		joinNames.add("Rahul");
		joinNames.add("Raju");
		
		System.out.println(joinNames);
		
		StringJoiner joinNames2 = new StringJoiner(":","[","]");

		joinNames2.add("peter");
		joinNames2.add("Rahim");
		
		System.out.println(joinNames2);
		
		StringJoiner merge = joinNames.merge(joinNames2);
		System.out.println(merge);
		
		merge.add("a");
		System.out.println(merge);
	}

}
