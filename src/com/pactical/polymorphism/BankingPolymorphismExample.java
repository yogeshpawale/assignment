package com.pactical.polymorphism;

public class BankingPolymorphismExample {

	// Main program
	
    public static void main(String[] args) {
        // Create different account objects
        Account account1 = new SavingsAccount("SA123", 10000, 5.0);
        Account account2 = new CurrentAccount("CA456", 5000, 1000);
        Account account3 = new FixedDepositAccount("FD789", 20000, 3, 6.0);

        // Perform polymorphic operations
        account1.deposit(5000);                    //10000+5000=15000
        account1.withdraw(2000);
        account1.displayBalance();                      //13000
        ((SavingsAccount) account1).calculateInterest();     //13000*.05=650

        account2.deposit(2000);             //5000+2000=7000
        account2.withdraw(8000);            
        account2.displayBalance();                   //insufficient amount ---balance is 7000
        ((CurrentAccount) account2).checkOverdraft();

        account3.deposit(10000);                      //30000
        account3.withdraw(5000);
        account3.displayBalance();                   //25000
        ((FixedDepositAccount) account3).closeAccount();       //25000*3*0.06=4500--------25000+4500=29500
    }

}


