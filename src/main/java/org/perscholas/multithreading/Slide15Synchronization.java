package org.perscholas.multithreading;

public class Slide15Synchronization implements Runnable {

	private static int counter = 0;
	

	@Override
	public  void run() {
		while (counter < 10) {
//
			synchronized (Slide15Synchronization.class) {
				System.out.println("[" + Thread.currentThread().getName() + "] before: " + counter);
				counter++;
				System.out.println("[" + Thread.currentThread().getName() + "] after: " + counter);
			}
		}
		counter = 0;
		System.out.println("other threads");
	}

	public static void main(String[] args) throws InterruptedException {
		Thread[] threads = new Thread[5];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(new Slide15Synchronization(), "thread-" + i);
			threads[i].start();
//			threads[i].join();
		}
	}
}