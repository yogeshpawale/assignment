package com.pactical.assignment5;

public class SquareNumber {

//	7.  Write the program to print the square of any number.
	
	public int getSquareNumber(int a) {
		
		int result= a*a;
		System.out.println("Square of the number is : "+result);
		return result;
	}
	
	
	public static void main(String[] args) {
		
		SquareNumber obj = new SquareNumber();
		obj.getSquareNumber(15);
		
	}
}
