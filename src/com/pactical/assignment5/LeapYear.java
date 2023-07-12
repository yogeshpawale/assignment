package com.pactical.assignment5;

public class LeapYear {

	// 2.write a program  to check whether  year is leap year or not. (If else stmt).
	
	public static void main(String[] args) {
		int year=2020;
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			
			System.out.println("this is leap year");
		}else {
			System.out.println("this is not leap year");
		}
	}
}
