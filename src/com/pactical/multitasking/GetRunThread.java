package com.pactical.multitasking;

public class GetRunThread extends Thread {

	public void run() {
		
		for(int i=0; i<=10; i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		GetRunThread obj = new GetRunThread();
		obj.start();
	}
}
