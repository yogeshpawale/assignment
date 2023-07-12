package com.pactical.assignment4;

//1. Write the java program to design method for addition of two number which returns int results to that method and result should be print into main method.
//2. Write the java program to design method for substraction of two number which returns int value to that method and result should be print into main method.
//3. Write the java program to design method for multiplication of two number which returns int value to that method and result should be print into main method.
//4. Write the java program to design method for division of two number which returns int value to that method and result should be print into main method.
//5. Write the Java Program to calculate total of five subject marks and average of it.

public class Assignment4 {

	
	
	public int getAddition(int a, int b ) {
		int results = a+b;
		System.out.println("a & b numbers addition is:          " +results);
		return results;
	}
	
	public int getSubstraction(int a, int b) {
		int results = a-b;
		System.out.println("a & b numbers substraction is:      " +results);
		return results;
	}
	
	public int getMultiplication(int a, int b) {
		int results = a*b;
		System.out.println("a & b numbers multiplication is:    " +results);
		return results;
	}
	
	public int getDivision(int a, int b) {
		int results = a/b;
		System.out.println("a & b numbers division is:          " +results);
		return results;
		
	}
	public float getAverage(int a, int b,int c, int d, int e) {
		int total = a+b+c+d+e;
		float results = total/5;
		System.out.println("a ,b , c ,d & e numbers average is: " +results);
		return results;
	}
	
	public static void main(String[] args) {
		
		Assignment4 obj = new Assignment4();
		obj.getAddition(15, 20);
		obj.getSubstraction(100, 25);
		obj.getMultiplication(20, 15);
		obj.getDivision(50, 10);
		obj.getAverage(15, 15, 20, 40, 45);
	}
}
