package com.BankingSystem;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login loginManager = Login.getInstance();

        Banking bankingProcess = new Banking();
        bankingProcess.viewBalance(); 
        loginManager.log_in();

        bankingProcess.viewBalance(); 
        bankingProcess.deposit(1000); 
        bankingProcess.withdraw(500); 

        // Logging out the user
        loginManager.log_out();

        // Trying to access banking operations after logging out
        bankingProcess.viewBalance();
	}

}
