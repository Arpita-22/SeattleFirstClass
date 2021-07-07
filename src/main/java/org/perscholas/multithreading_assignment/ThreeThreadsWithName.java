package org.perscholas.multithreading_assignment;

public class ThreeThreadsWithName extends Thread {
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		for(int i = 1; i < 6 ; i++) {
			
			try {
				
				
				Thread.sleep(1000);
				
			}catch(InterruptedException e) {
				e.printStackTrace();
				
			}
			
			System.out.println(i);
		}
			
	}

	public static void main(String[] args) throws InterruptedException {

		Thread thread1 = new Thread(new ThreeThreadsWithName(), "my First Thread");
		Thread thread2 = new Thread(new ThreeThreadsWithName(), "my Second Thread");
		Thread thread3 = new Thread(new ThreeThreadsWithName(), "my Third Thread");
		
		thread1.start();
		thread1.join();
		thread3.start();
		thread2.start();

	}

}
