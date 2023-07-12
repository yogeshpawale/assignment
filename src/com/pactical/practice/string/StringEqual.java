package com.pactical.practice.string;

public class StringEqual {
	
	public static void main(String[] args) {
		
		String s1 = new String();
		String s2 = s1;
		String s3 = new String();
		
		if(s2==s3)
			System.out.println("1");
		if(s2.equals(s3))
			System.out.println("2");
		else
			System.out.println("nothing");
	}

	
}
