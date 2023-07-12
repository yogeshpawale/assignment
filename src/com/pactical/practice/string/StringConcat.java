package com.pactical.practice.string;

public class StringConcat {

	public static void main(String[] args) {
		
		String first_name = "Yogesh";
//		String last_name = " Pawale";             //posible to concate
		first_name.concat(" Pawale");            // concat() methods appends the string at the end
 	
//		System.out.println(first_name.concat(last_name));       // posible to concate print
//		System.out.println(first_name);                     // ----Strings are  immutable so only print Yogesh
		
		// in anothe way concat means directly print in concate
		System.out.println(first_name.concat(" Pawale"));
	}
}
