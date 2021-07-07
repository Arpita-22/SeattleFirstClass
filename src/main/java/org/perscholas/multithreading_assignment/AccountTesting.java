package org.perscholas.multithreading_assignment;

public class AccountTesting extends Thread{
	Account account;

	
	
	public AccountTesting(Account account) {
		this.account = account;
		 account.getBalance();
		
		
	}
	

	@Override
	public void run (){
		for(int i = 0; i < 5; i++) {
			withdrawal();
			
		}	 			

	}


	private void withdrawal() {

		synchronized(account) {
			if(account.getBalance() >= 10) {

				System.out.println(Thread.currentThread().getName() + " is going to withdraw");
				account.setBalance(account.getBalance() - 10);
				System.out.println(Thread.currentThread().getName()+ " completes the withdrawal");
				System.out.println();


			}else{

				System.out.println("Not enough in account for " + Thread.currentThread().getName() + " to withdraw " + account.getBalance());
			}
		}

		try {

			Thread.sleep(100);


		}catch(InterruptedException e) {
			e.printStackTrace();

		}
	}


	

	public static void main(String[] args) throws InterruptedException {
		Account account = new Account();
		
		Thread thread1 = new Thread(new AccountTesting(account), "Reema");
		Thread thread2 = new Thread(new AccountTesting(account), "Ranjeet");
		
	
		thread1.start();
		thread2.start();	
		
	}
}