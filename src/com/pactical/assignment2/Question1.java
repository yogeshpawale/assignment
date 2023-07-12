package com.pactical.assignment2;

public class Question1 {

	
	//1. Write the Java Program in which declares the different primitives data types.
	
	public static void main(String[] args) {
//		int a;
//		byte b;
//		short c;
//		long d;
//		float e;
//		char grade;
//		double f;
//		boolean result;
//		
//		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
//		System.out.println(e);
//		System.out.println(f);
//		System.out.println(result);
//		System.out.println(+grade);
		

		   int a = 0; 
				   int b= 1;
		   int c;
		    System.out.println("Fibonicci Series is:   "+a+  ","  +b+  ",");

		    for (int i = 1; i <= 100; i++) {
		      

		      // compute the next term
		      c = a + b;
		      a = b;
		      b = c;
		      System.out.print(a + ", ");
		    }
		  }
		
	
			
}
