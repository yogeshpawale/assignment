package com.pactical.abstraction;

public class LoanInterface implements Home, Car, Education, Bike, Land {

	@Override
	public void landLoan() {
		System.out.println("land loan is: 15,00,000");
		
	}

	@Override
	public void bikeLoan() {
		System.out.println("Bike loan is: 1,00,000");
		
	}

	@Override
	public void educationLoan() {
		System.out.println("education loan is: 50,000");
		
	}

	@Override
	public void carloan() {
		System.out.println("car loan is: 12,00,000");
		
	}

	@Override
	public void homeLoan() {
		System.out.println("Home loan is: 85,00,000");
		
	}

	public static void main(String[] args) {
		LoanInterface obj = new LoanInterface();
		obj.bikeLoan();
		obj.carloan();
		obj.landLoan();
		obj.homeLoan();
		obj.educationLoan();
		
		
	}
	
}
