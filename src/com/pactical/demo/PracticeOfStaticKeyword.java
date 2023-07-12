package com.pactical.demo;

public class PracticeOfStaticKeyword {

    int a=5;
	static int b=5;
	
	
	public static void main(String[] args) {
		
		PracticeOfStaticKeyword obj = new PracticeOfStaticKeyword();
		  
		System.out.println("non static   " +obj.a++);       //5 but after increment value is 6
		System.out.println("static    " +obj.b++);    //5 but after increment value is 6
		
		PracticeOfStaticKeyword obj1 = new PracticeOfStaticKeyword();
		
		System.out.println("non static   " +obj1.a++);       //5 but after increment value is 6
		System.out.println("static    " +obj1.b++);    //6 but after increment value is 7
		
        PracticeOfStaticKeyword obj2 = new PracticeOfStaticKeyword();
		
		System.out.println("non static   " +obj2.a++);       //5 but after increment value is 6
		System.out.println("static    " +obj2.b++);    //7 but after increment value is 8
		
	     PracticeOfStaticKeyword obj3 = new PracticeOfStaticKeyword();
			
			System.out.println("non static   " +obj3.a++);       //5 but after increment value is 6
			System.out.println("static    " +obj3.b++);    //8 but after increment value is 9
	
	
	}
}
