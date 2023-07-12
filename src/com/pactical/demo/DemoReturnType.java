package com.pactical.demo;



public class DemoReturnType {
	
	public int valueOfReturn() {
		int a =65;
		int b =20;
		int c=a+b;
//		System.out.println(c);
		return c;
		
		
	}
	
	public int subOfTwoNumber(int a, int b) {
		
	
		int c = a-b;
		return c;
		
	}
	public int multplication() {
		int a =10;
		int b =20;
	int	c= a*b;
	System.out.println(c);
		return c;
		
	}
	
	public String employeeInformation() {
		String str = "yogesh";
		System.out.println(str);
		return str;
	}
	public void m1() {
		DemoReturnType demo = new DemoReturnType();
		int add = demo.valueOfReturn();
		System.out.println(add);
		
		DemoReturnType demo1 = new DemoReturnType();
		int y = demo1.subOfTwoNumber(25,10);                        //i have use two value ,   return type used int & two argument pass
		System.out.println(y);
		DemoReturnType demo2 = new DemoReturnType();
		demo2.multplication();
		
		DemoReturnType demo3 = new DemoReturnType();
		
		demo3.employeeInformation();
	}
	
	
}
