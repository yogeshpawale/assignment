package com.pactical.assignment7;

import java.util.Scanner;

public class Checking {

	//1. Design method to check whether the character is alphabet, digit and special symbol.
	
	public void getCheck(int ch) {
		
		if(ch >=65 && ch <=90) {
			System.out.println(" capital alphabate character");
		} else if(ch>=97 && ch<=122) {
			System.out.println("small alphabate character");
		} else if(ch>=48 && ch<=57) {
			System.out.println("character is digit number");
		}else if(ch>=33 && ch<=47 || ch>=58 && ch<=64 || ch>=91 && ch<=96 || ch>=123 && ch<=127) {
			System.out.println("this is sysmbol");
		} else {
			System.out.println("incorrect input");
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter the character");
		Scanner sc = new Scanner(System.in);
	  int ch = sc.next().charAt(0);
	    Checking obj = new Checking();
	    obj.getCheck(ch);
	    
	}
}
