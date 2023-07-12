package com.pactical.assignment5;

import java.util.Scanner;

public class EvenOrOddNumber {

//	5. Write a program to check whether number is even or odd.
	
	
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		
		EvenOrOddNumber obj = new EvenOrOddNumber();
//		int a = 28;
		
		int a = sc.nextInt();
		
		if(a%2==0) {
			
			System.out.println("number is even");
		}else if(a%2!=0) {
			System.out.println("number is odd");
		}else {
			System.out.println("invalid input");
		}
		sc.close();
	}
}
