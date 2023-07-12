package com.pactical.inheritence;

public class SingleInheritenceMainClass {
public static void main(String[] args) {
		
//		SingleInhertenceChildClass property = new SingleInhertenceChildClass();
//		property.home();
//		property.car();
//		property.land();
//		property.mobile();
//		property.money();
	
		// dynamic dispatch concept
		
		SingleInheritanceParentClass obj = new SingleInhertenceChildClass();
	System.out.println(obj.a);
	System.out.println(obj.b);
//	System.out.println(obj.c);
		
		obj.home();
		obj.car();
		obj.land();
//		obj.mobile();
//		obj.money();
//		
		
	}
}
