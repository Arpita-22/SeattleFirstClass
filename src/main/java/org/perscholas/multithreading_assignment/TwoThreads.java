package org.perscholas.multithreading_assignment;

public class TwoThreads extends Thread {
	
	@Override
	public void run() {
		for(int i = 1; i < 5; i++) {
			try {
				
				Thread.sleep(2000);
				
			}catch(InterruptedException e){
				
				e.printStackTrace();
				
			}
			System.out.println(i);
			
		}
	}

	public static void main(String[] args) {
		TwoThreads thread1 = new TwoThreads();
		TwoThreads thread2 = new TwoThreads();
		
		thread1.start();
		thread2.start();
		

	}

}
