package com.pactical.abstraction;

public class Demo1 implements Demo {

	@Override
	public void getAddition() {
		int a=15;
		int b=20;
		int add = a+b;
				
		System.out.println(add);
		
	}

	@Override
	public void getSubstraction() {
		System.out.println("sub");
		
	}
	
	public static void main(String[] args) {
		
		Demo1 obj = new Demo1();
		obj.getAddition();
		obj.getSubstraction();
		obj.m1();
		Demo.m2();
	}


}
