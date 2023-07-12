package com.pactical.abstraction;

public interface Demo {

	public abstract void getAddition();
	 public abstract void getSubstraction();
	default void m1() {
		System.out.println("this is m1 method");
	}
	public static void m2() {
		System.out.println("this is m2 method");
	}
	

	
}
