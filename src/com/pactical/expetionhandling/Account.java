package com.pactical.expetionhandling;

public class Account {

	private int balance =50000;
	
	public int balance() {
		
		return balance;
		
	}
	public void getWithdraw(int amount) {
		
		try {
			if(amount>balance) {
				
				throw new InsufficentAmountException("insufficient fund");
			
				}

		
			balance = balance-amount;
		} catch(Exception e) {
			System.out.println(e);
		}
			

	}
	public static void main(String[] args) {
		Account account = new Account();
		account.balance();
		System.out.println("current balance :" +account.balance());
		
		account.getWithdraw(70000);
		System.out.println(account.balance());
		
		
		
	}
}
