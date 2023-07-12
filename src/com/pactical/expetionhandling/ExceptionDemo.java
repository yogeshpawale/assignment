package com.pactical.expetionhandling;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		System.out.println("first line");
		System.out.println("Second line");
		
		try{
			int a=10/0;
			}
		catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("third line");
		System.out.println("fourth line");
		System.out.println("fifth line");
	}
}
