package com.pactical.demo;

public class MyThread implements Runnable{

	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
		
	}

	public static void main(String[] args) {
		MyThread thread = new MyThread();
		Thread t = new Thread(thread);
		Thread t1 = new Thread(thread);
//		Thread t2 = new Thread(thread);
		t.start();
		t1.start();
//		t2.start();
	}
	
}
