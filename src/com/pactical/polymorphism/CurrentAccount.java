package com.pactical.polymorphism;

public class CurrentAccount extends Account {

	// CurrentAccount class (derived from Account)
	
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void checkOverdraft() {
        if (balance < 0 && Math.abs(balance) > overdraftLimit) {
            System.out.println("Account " + accountNumber + " has exceeded the overdraft limit.");
        } else {
            System.out.println("Account " + accountNumber + " is within the overdraft limit.");
        }
    }


}
