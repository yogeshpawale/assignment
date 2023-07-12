package com.pactical.superthiskeyword;

public class ChildClass extends ParentClass {

	public ChildClass() {
		super(150,250);
               System.out.println("this is child defualt constructor");
	}

	public ChildClass(int a) {
		this();
		System.out.println("this is first parametrised constructor" +a);

	}

	public ChildClass(int a, int b) {
		this(40);
		System.out.println("this is second parametrised constructor" +a +","+ b);

	}
	public static void main(String[] args) {
		
		ChildClass obj1 = new ChildClass(15,25);
	
	}
}
