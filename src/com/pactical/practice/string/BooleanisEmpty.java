package com.pactical.practice.string;

public class BooleanisEmpty {
	
	public static void main(String[] args) {
		
		String str = "";
		String str1 = new String("");
		String str2 = new String("yogesh");
		
		System.out.println("str length is >>"+str.length());
		System.out.println("str1 length is >>"+str1.length());
		System.out.println("str2 length is >>"+str2.length());
		
		System.out.println(str.isEmpty());
		System.out.println(str1.isEmpty());
		System.out.println(str2.isEmpty());
	}

	
}
