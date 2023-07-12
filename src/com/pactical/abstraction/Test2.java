package com.pactical.abstraction;

public class Test2 extends Test1 {

	@Override
	public void m1() {
		System.out.println("this is m1 method");
		
	}

	@Override
	public void m2() {
		System.out.println("this is m2 method");
		
	}

	@Override
	public void m3() {
		System.out.println("this is m3 method");
		
		
	}
	public Test2() {
		System.out.println("this is Test2 constructor");
	}
	

	public static void main(String[] args) {
		Test2 obj = new Test2();
		obj.m1();
		obj.m2();
		obj.m3();
		
	
	}
	

	
}
