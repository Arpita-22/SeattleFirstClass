package org.perscholas.multithreading;

public class ThreadOperations extends Thread {
	
	public ThreadOperations(String name){
		super(name);
		
	}
	
	@Override
	public void run() {
		System.out.println("Executing Thread " + Thread.currentThread().getName());
	}

	public static void main(String[] args) throws InterruptedException {
		
		ThreadOperations myThread = new ThreadOperations("myyyyThread");
		ThreadOperations myThread2 = new ThreadOperations("myyyyThread2");
		Thread myThread3 = new ThreadOperations("myyyyThread3");
		myThread.start();
		myThread2.start();
		myThread3.start();

	}

}
