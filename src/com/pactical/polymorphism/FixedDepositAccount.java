package com.pactical.polymorphism;

public class FixedDepositAccount extends Account {

	// FixedDepositAccount class (derived from Account)
	
    private int tenure;
    private double interestRate;

    public FixedDepositAccount(String accountNumber, double balance, int tenure, double interestRate) {
        super(accountNumber, balance);
        this.tenure = tenure;
        this.interestRate = interestRate;
    }

    public void closeAccount() {
        double interest = balance * interestRate * tenure / 100;
        balance += interest;
        System.out.println("Account " + accountNumber + " closed. Final amount: " + balance);
    }


}
