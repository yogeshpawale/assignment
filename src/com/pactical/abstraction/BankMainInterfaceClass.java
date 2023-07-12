package com.pactical.abstraction;

public class BankMainInterfaceClass {
	
	public static void main(String[] args) {
		
		RbiBank obj = new SBIBank();
		RbiBank obj1 = new UnionBank();
		RbiBank obj2 = new BOMBank();
		RbiBank obj3 = new AxisBank();
		System.out.println(obj.rateOfInterest());
		System.out.println(obj1.rateOfInterest());
		System.out.println(obj2.rateOfInterest());
		System.out.println(obj3.rateOfInterest());
	}

}
