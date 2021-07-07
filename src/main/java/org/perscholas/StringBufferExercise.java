package org.perscholas;

public class StringBufferExercise {

	public static void main(String[] args) {
		
		StringBuffer str = new StringBuffer("Hello");
		
		System.out.println(str.length());
		System.out.println(str.capacity());
		
		str.append(" world");
		System.out.println(str);
		str.append(2);
		System.out.println(str);
		str.insert(5, false);
		System.out.println(str);
		
		char [] arr = {'a','b'};
		str.insert(0, arr);
		System.out.println(str);
		
		
		
		
	}

}
