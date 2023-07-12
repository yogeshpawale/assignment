package com.pactical.demo;

public class AddDemo {

	public void subOfNumber() {
		int a=60;
		int b=30;
		int c=a-b;
		System.out.println(c);
		
	}
	public static void addOfNumber() {
		int a=20;
		int b=25;
		int c=a+b;
		System.out.println(c);
		System.out.println("this is static method");
	}
	public void m1() {
		
	}
	
	static {
		System.out.println("this is static block");
	}
	
	public static void main(String[] args) {
		System.out.println("this is main method");
		AddDemo sub = new AddDemo();
		sub.subOfNumber();
		AddDemo.addOfNumber();
		
		
		
	}
}
