package com.pactical.assignment5;

public class HighestNumberCheck {

	//  3.write a program to find out maximum number among three number(if else if ladder statement)
	
	
	
	
	public static void main(String[] args) {
		int a=112;
		int b=54;
		int c=215;
		
		if((a>b) && (a>c)) {
			System.out.println(" number a is the gretest value");
		} else if((b>a) && (b>c)) {
			System.out.println(" number b is the gretest number");
		}else if((c>a) && (c>b)) {
			System.out.println(" c is the greatest number");
		}else {
			System.out.println("all number are Equal or invalid input");
		}
	}
}
