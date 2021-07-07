package org.perscholas.multithreading_assignment;

public class ThreeThreads extends Thread {
	
	@Override
	public void run() {
//		System.out.println("Thread" + "[" + Thread.currentThread().getName() + "," + Thread.currentThread().getPriority() + "," + Thread.currentThread().getThreadGroup().getName() + "]" );
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

		
		Thread[] threads = new Thread[3];
		
		for(int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(new ThreeThreads(), "Thread-" + i);
			threads[i].start();
			threads[0].join();
		}
				

		

	}

}
