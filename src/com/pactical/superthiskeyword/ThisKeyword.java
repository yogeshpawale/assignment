package com.pactical.superthiskeyword;

public class ThisKeyword {

	 int instanceVar = 5;
	
	 static int staticVar = 10;
	
	void action() {
		
		int instanceVar = 20;
		
    	this.instanceVar = 50;
		
		 int staticVar = 40;
		 this.staticVar = 100;
		 
		 System.out.println("value of instance variable : " +this.instanceVar);
		 System.out.println("value of static variable : " +this.staticVar);
		 System.out.println("value of variable declared inside method : " +instanceVar+" "+staticVar);
	}
	
	public static void main(String[] args) {
		
		ThisKeyword obj = new ThisKeyword();
		obj.action();
	}
	
}
