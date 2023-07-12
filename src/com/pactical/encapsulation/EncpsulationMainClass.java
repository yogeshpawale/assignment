package com.pactical.encapsulation;

public class EncpsulationMainClass {

	public static void main(String[] args) {
		Encapsulation1 obj = new Encapsulation1();
		obj.setSalary(7000);                                 // salary is positive
	//	obj.setSalary(-7000);                                // salary is negative so on cosole output is 0
	//	System.out.println(obj.getSalary());
		System.out.println(obj.getSalary());
	}
	
	
	
}
