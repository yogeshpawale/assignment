package com.pactical.inheritence;

public class HierchicalMainClass {

	public static void main(String[] args) {
		HierchicalSonClass obj1 = new HierchicalSonClass();
		obj1.car();
		obj1.mobile();
		obj1.tataCar();
		
		HierchicalChildClass obj2 = new HierchicalChildClass();
		obj2.honda();
//		obj2.car();
//		obj2.mobile();
//		obj2.tataCar();
//		
	}
}
