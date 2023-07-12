package com.pactical.assignment6;

public class FactorialNumber {

//	4. Design method int factorial(int no)  which returns int value to that method. 
	//print the results into main method (Example enter no as 5, factorial means 5*4*3*2*1 then output is 120)
	
	public int factorial(int no) {
		
		int result = no*(no-1)*(no-2)*(no-3)*(no-4);
		System.out.println(result);
		return result;
	}
	
	public static void main(String[] args) {
		
		FactorialNumber obj = new FactorialNumber();
		obj.factorial(5);
	}
}
