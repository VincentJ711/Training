package com.revature.threads;

public class ThreadThread extends Thread{
	public void run() {
		for(int i = 0; i <50; i++) {
			System.out.println("\t\t" + Thread.currentThread().getName());
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
