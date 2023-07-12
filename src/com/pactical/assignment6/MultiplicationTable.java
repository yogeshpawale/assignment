package com.pactical.assignment6;

public class MultiplicationTable {

//	2. Design method void multiplication (int no) and print the multiplication table. ( Example enter the no=5 then output like 
//	5*1=5.......5*10=50)
	
	public void multiplication(int no) {
		
		
		for(int i=1; i<=10; i++) {
			int result = no*i;
			System.out.println(no +"*" + i +"=" +result );
		}
	}
	public static void main(String[] args) {
		MultiplicationTable obj = new MultiplicationTable();
		obj.multiplication(5);
		
	}
}
