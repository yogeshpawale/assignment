package com.pactical.assignment5;

import java.util.Scanner;

public class GreaterNumberCheck {

//	6. Write the program to check whether the no is greater than 100.
	
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		if(number>100) {
			System.out.println("number is gretter than 100");
		}else if(number<100) {
			System.out.println("number is less than 100");
		}
		
		else {
			System.out.println("number is Equal to 100");
		}
	}
}
