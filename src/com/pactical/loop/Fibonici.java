package com.pactical.loop;

public class Fibonici {
               
	public static void main(String[] args) {
		int a=0;
		int b=1;
		System.out.print(a + ","+b + ",");
		
		for(int i=1; i<=20; i++) {
			int c = a+b;
			
		
			System.out.print(c + ",");
			
			a=b;
			b=c;
			
		}
		
		
		
	}
}
