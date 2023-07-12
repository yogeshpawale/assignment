package com.pactical.loop;

public class PrimeNumber {

	//prime number 2 , 3, 5 , 7, 11 , 13 , 17 , 19 , 23, 29...........
	public static void main(String[] args) {
        int a=1;
        int n=100;
		int count=2;    // count 2%2= 0
		System.out.println(count);
		for(int i=1; i<=n; i++) {
			
			        
			if(i%i==0 || i/a==0 && i/n/2==0) {
				count++;
				System.out.println(i);
				
			}
		}
		
	}
}
