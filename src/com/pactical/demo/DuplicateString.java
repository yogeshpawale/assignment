package com.pactical.demo;

public class DuplicateString {

	public static void main(String[] args) {
		
		String str = "this is java  programm java is";

		

		String a[] = str.split(" ");

		int c=0;

		for(int i=0; i<=a.length-1; i++) {
           
			for(int j=i+1; j<=a.length-1; j++) {
				if(a[i].equalsIgnoreCase(a[j])) {
					System.out.println(a[i]);
					
					
					
					c++;
	} 
			}
		}
		System.out.println(c);
	}
}
