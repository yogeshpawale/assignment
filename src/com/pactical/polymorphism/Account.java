package com.pactical.polymorphism;

public class Account {
	// Account class (base class)
	
	    protected String accountNumber;
	    protected double balance;

	    public Account(String accountNumber, double balance) {
	        this.accountNumber = accountNumber;
	        this.balance = balance;
	    }

	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println(amount + " deposited into account " + accountNumber);
	    }

	    public void withdraw(double amount) {
	        if (balance >= amount) {
	            balance -= amount;
	            System.out.println(amount + " withdrawn from account " + accountNumber);
	        } else {
	            System.out.println("Insufficient balance in account " + accountNumber);
	        }
	    }

	    public void displayBalance() {
	        System.out.println("Account " + accountNumber + " balance: " + balance);
	    }
	}

	
	
	   

	
	
	