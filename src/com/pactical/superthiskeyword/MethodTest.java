package com.pactical.superthiskeyword;



public class MethodTest {

	int a;
	int b;
	
	MethodTest(){
		a=10;
		b=20;
	}
	void display(MethodTest obj) {
		System.out.println("a = "+obj.a +  " b = " +obj.b);
	}
	void get() {
		display(this);
	}
	public static void main(String[] args) {
		MethodTest object = new MethodTest();
		object.get();
	}
}
