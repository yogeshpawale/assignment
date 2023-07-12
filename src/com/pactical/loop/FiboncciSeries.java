package com.pactical.loop;

public class FiboncciSeries {	
	public static void main(String[] args) {
	double	 a=0d;
	double b=1d;
		
		System.out.println(a);
		System.out.println(b);
		
		for(int i=1; i<=100; i++) {
			
			double c=a+b;
			
			System.out.println(c);
			a=b;
			b=c;
			
		}
	}
}	
		
		
		
		

