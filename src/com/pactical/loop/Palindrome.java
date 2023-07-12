package com.pactical.loop;

public class Palindrome {

	public static void main(String[] args) {
		int a= 525;
		int b =0;
		int c = a;
		
		while(a>0) {
			int d= a%10;                    
		 a =a/10;                  
			b =((b*10)+d);                
			
		}
		
		if(c==b) {
			System.out.println("this is palindrome number");
		}else {
			System.out.println("this is not palindrome number");
		}
	}
	
	
}
