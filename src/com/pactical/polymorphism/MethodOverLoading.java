package com.pactical.polymorphism;

import java.util.Scanner;

public class MethodOverLoading {

	public void displayInformation(int a, int b) {
		
		System.out.println(a+b);
	}
public void displayInformation(int a, int b, int c) {
		
		System.out.println(a+b+c);
	}
public void displayInformation(int a, String name) {
	
	System.out.println(a+name);
}
public void displayInformation(String name, int b) {
	
	System.out.println(name+b);
}
	
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter the first value");
	int x = sc.nextInt();
	System.out.println("enter the second value");
	int y = sc.nextInt();
	System.out.println(x+y);
	
	MethodOverLoading obj = new MethodOverLoading();
//	obj.displayInformation(15, 20);
//	obj.displayInformation(10, 20, 30);
//	obj.displayInformation(15, "yogesh");
//	obj.displayInformation("kalpana", 15);
//	
	obj.displayInformation(55, 55);
	obj.displayInformation(20, 20);
	obj.displayInformation(10, 10);
	obj.displayInformation(15, 15);
	obj.displayInformation(1000000, 442233887);
}
}
