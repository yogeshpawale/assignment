package com.pactical.superthiskeyword;

public class ParentClass {

	

	public ParentClass(int a) {
		this();
		System.out.println("this is parent first parametrised constructor" +a);
	}
	

	public ParentClass(int a, int b) {
		this(40);
		System.out.println("this is parent first parametrised constructor" +a+"," +b);
	}
	public ParentClass() {
		System.out.println("this is defualt constructor");
	}
}
