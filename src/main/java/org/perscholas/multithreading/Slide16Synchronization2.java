package org.perscholas.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class Slide16Synchronization2 implements Runnable {

	private static AtomicInteger counter = new AtomicInteger(0);
	

	@Override
	public  void run() {
		while (counter.get() < 10) {
//
			System.out.println("[" + Thread.currentThread().getName() + "] before: " + counter);
			counter.incrementAndGet();
			System.out.println("[" + Thread.currentThread().getName() + "] after: " + counter);
		}
		counter = new AtomicInteger(0);
		System.out.println("other threads");
	}

	public static void main(String[] args) throws InterruptedException {
		Thread[] threads = new Thread[5];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(new Slide16Synchronization2(), "thread-" + i);
			threads[i].start();
//			threads[i].join();
		}
	}
}