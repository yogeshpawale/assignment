package com.pactical.demo;

public class Pattern {

	public static void main(String[] args) {
		
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
//		for(int i=5; i>=1; i--) {
//			for(int j=1; j<=i; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		for(int i=1; i<=5; ++i) {
			for(int j=i; j<=5; ++j) {
				for(int k=i; k<=j; ++k) {
					
				}
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
}
