package com.pactical.assignment7;

public class RevrseNumber {
	
	//4. Design method public int getReverseNumber(int num) which return int value to that method and result print into main method.
	//(Enter the no=125 then output will be 521
	public int getReverseNumber(int num) {
		
		int b=0;
		int c=num;
		while(num>0) {
			int d= num%10;
			num = num/10;
			b=(b*10)+d;
		}
		System.out.println(b);
	
		
		return num;
	
	}
	
	public static void main(String[] args) {
		
		RevrseNumber obj = new RevrseNumber();
		obj.getReverseNumber(1256);
	}
}
