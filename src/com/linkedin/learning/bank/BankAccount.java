package com.linkedin.learning.bank;

public class BankAccount {
	private String owner;
	private double balance;

	public BankAccount(String owner, double balance) {
		this.owner = owner;
		this.balance = balance;
	}

	public String getOwner() {
		return owner;
	}

	public double getBalance() {
		return balance;
	}

	public String withdaraw(double amount) {
		if(amount <=balance) {
			balance -= amount;
			return "The updated balance is :"+balance;
		}
		return "Widrawal Failed!";

	}
	public String deposit(double amount) {
		if(amount >0) {
			balance += amount;
			return "The updated balance is :"+balance;
		}
		return "Deposit Failed!";
	}
}
