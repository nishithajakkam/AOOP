package com.BankingSystem;

public class Banking {
	private Login loginManager;

    public Banking() {
        loginManager = Login.getInstance();
    }

    public void viewBalance() {
        if (loginManager.loggedIn()) {
            System.out.println("Displaying balance...");
            	        } else {
            System.out.println("User not logged in. Please login to view balance.");
        }
    }

    public void deposit(double amount) {
        if (loginManager.loggedIn()) {
            System.out.println("Depositing amount: " + amount);
        } else {
            System.out.println("User has not logged in, Kindly please login to deposit money.");
        }
    }

    public void withdraw(double amount) {
        if (loginManager.loggedIn()) {
            System.out.println("Withdrawing amount: " + amount);
        } 
        else {
            System.out.println("User has not logged in, Kindly please login to withdraw money.");
        }
    }

}
