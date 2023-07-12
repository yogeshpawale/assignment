package com.pactical.polymorphism;

public class SavingsAccount extends Account {

	// SavingsAccount class (derived from Account)
	 private double interestRate;

	    public SavingsAccount(String accountNumber, double balance, double interestRate) {
	        super(accountNumber, balance);
	        this.interestRate = interestRate;
	    }

	    public void calculateInterest() {
	        double interest = balance * interestRate / 100;
	        balance += interest;
	        System.out.println("Interest calculated for account " + accountNumber + ": " + interest);
	    }
	
}
