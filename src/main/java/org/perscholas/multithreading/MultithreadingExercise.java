package org.perscholas.multithreading;

import java.lang.Thread.State;

public class MultithreadingExercise {

	public static void main(String[] args) {
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		State state = Thread.currentThread().getState();	
		String threadGroupName = Thread.currentThread().getThreadGroup().getName();

		System.out.println("id = " + id + "name = " + name + "prority = " + priority + "state = " + state + "threadGroupName = " + threadGroupName);
	}

}
