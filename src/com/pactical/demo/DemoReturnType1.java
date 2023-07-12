package com.pactical.demo;

import java.util.Scanner;

public class DemoReturnType1 {
     
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("enter the first no");
		int x=scanner.nextInt();
		
		System.out.println("enter the second no");
		int y = scanner.nextInt();
		
	System.out.println("first value>>"  +x);
	System.out.println("second value>>"  +y);
		
		System.out.println(x+y);
	
		DemoReturnType obj = new DemoReturnType();
		obj.m1();
		scanner.close();
	}
}
