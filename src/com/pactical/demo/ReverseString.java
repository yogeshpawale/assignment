package com.pactical.demo;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "this is java programm";

		char []a= str.toCharArray();
		String str1 = " ";
		
		for(char x:a) {
			str1 = x+str1;
		}
		System.out.println(str1);
	}
}
