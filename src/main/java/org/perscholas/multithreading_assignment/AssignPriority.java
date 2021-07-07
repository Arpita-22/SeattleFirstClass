package org.perscholas.multithreading_assignment;

public class AssignPriority extends Thread{
	
	@Override
	public void run() {
		
		for(int i = 0; i < 3; i++) {
			
			try {
				
			System.out.println( "running thread " + Thread.currentThread().getName());
			System.out.println("running thread priority " + Thread.currentThread().getPriority());
			System.out.println("=============================================");
			Thread.sleep(2000);		
				
			}catch(InterruptedException e) {
				e.printStackTrace();
				
			}
			
		}	
		 
	}

	public static void main(String[] args) {
		
		Thread thread1 = new Thread(new AssignPriority (), "Thread-0");
		Thread thread2 = new Thread(new AssignPriority (), "Thread-1");
		Thread thread3 = new Thread(new AssignPriority (), "Thread-2");
		
		thread1.setPriority(MIN_PRIORITY);
		thread2.setPriority(NORM_PRIORITY);
		thread3.setPriority(MAX_PRIORITY);
		
		thread1.start();
		thread2.start();
		thread3.start();
				

	}

}
