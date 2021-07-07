package org.perscholas;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueExercises {
	
	// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Queue.html
	// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Deque.html
	// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/ArrayDeque.html

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deque<String> deque = new ArrayDeque<>();
		deque.add("red");
		deque.add("green");
		deque.add("blue");
		System.out.println(deque);
		
		deque.addFirst("cyan");
		System.out.println(deque);
		deque.addLast("magenta");
		System.out.println(deque);
//		System.out.println(deque.peek());
//		System.out.println(deque.peekLast());
		System.out.println(deque.pop()); // Remove the head (first item) of the list
		System.out.println(deque);
		deque.push("cyan"); // Same as addFirst()
		System.out.println(deque);
		System.out.println(deque.removeLast());
		System.out.println(deque);
	}

	}


