package com.pactical.encapsulation;

public class B {

	public static void main(String[] args) {
		A obj = new A();
		obj.setSalary(5000);
		A obj1 = new A();
		obj1.setSalary(-5000);
		System.out.println(obj.getSalary());
		System.out.println(obj1.getSalary());
	}
}
