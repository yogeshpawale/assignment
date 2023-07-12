package com.pactical.practice.string;

public class BooleanContains {

	public static void main(String[] args) {
		
		String strs = "my School name is rgpk ";
		String str = "pool";
		String str1 = "School";
		String str2 = "Schools";
		
		System.out.println(strs.contains(str));
		System.out.println(strs.contains(str1));
		System.out.println(strs.contains(str2));
		System.out.println(str1.contains(strs));
		
	}
}
