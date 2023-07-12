package com.pactical.assignment;

public class DuplicateNumber {

	public static void main(String[] args) {
		
		int a[] = {5,20,14,5,17,20,5,14,5,14,3,7,9,99};
		
		for(int i=0; i<=a.length-1; i++) {
			
			for(int j=i+1; j<=a.length-1; j++) {
				if(a[i]==a[j]) {
					System.out.println("duplicate no is : "+a[j]);	
				}
				
			}
		}
		
		
		
		
	}
}
