package org.perscholas.multithreading;

public class MyRunnable implements Runnable{
	
	@Override
	public void run() {
		System.out.println("Executing Thread " + Thread.currentThread().getName());
	}
	
	
	

	public static void main(String[] args) {
//		Thread myThread = new Thread(new MyRunnable(), "myyyyyyyyyRunnable");
//		Thread myThread2 = new Thread(new MyRunnable(), "myyyyyyyyyRunnable2");
//		myThread.start();
//		myThread2.start();
		
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
		System.out.println("Done sleeping!");
	}

	

}
