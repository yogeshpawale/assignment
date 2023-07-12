package com.pactical.practice.string;

public class StringEquals2 {
	
	public static void main(String[] args) {
		
		String s1 = new String("ShreeKrishna");
		String s2 = s1;
		String s3 = new String("mahadev");
		
	    System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s1.equals(s3));
		if(s1==s3) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		if(s1==s2) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
			
		
	}

}
