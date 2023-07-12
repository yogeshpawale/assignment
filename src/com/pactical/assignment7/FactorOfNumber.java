package com.pactical.assignment7;

import java.util.Scanner;

public class FactorOfNumber {

	//  3. Design method to print factors of given number( Enter no = 6 then factors should be displayed like 1,2,3,6.
	
	
	public void factorOfNumber(int no) {
		
		int i=1;
	   while(i<=no) {
			
			if(no%i==0) {
				System.out.println(i);
			}
			i++;
		}
		
		}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
	   
	   int no = sc.nextInt();
	 
	  
		FactorOfNumber obj = new FactorOfNumber();
		obj.factorOfNumber(no);
	}
}
