package com.pactical.multitasking;

public class GetThread implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<=10; i++) {
			System.out.println(i);
		}
		
	}
   public static void main(String[] args) {
	
	   GetThread obj = new GetThread();
	   Thread obj1 = new Thread(obj);
	   obj1.start();
}
}
