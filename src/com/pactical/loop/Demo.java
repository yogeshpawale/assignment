package com.pactical.loop;

public class Demo {

	String name;
	int a;
	public Demo() {
	name="yogesh";
	a=15;
}
	
//	public void m1() {
//		System.out.println(name);
//		System.out.println(a);
	//}
	
	public static void main(String[] args) {
		
		Demo constructor = new Demo();
		
		
		
		System.out.println(constructor.name);
		System.out.println(constructor.a);
	}
}
