package com.linkedin.learning.bank;

public class BankMain {

	public static void main(String[] args) {

		
		BankAccount bankAccountOne = new BankAccount("Jeevan", 1000.0);
		
		System.out.println(bankAccountOne.getOwner());
		System.out.println(bankAccountOne.getBalance());
//		System.out.println(bankAccountOne.owner());

		System.out.println(bankAccountOne.deposit(100));
		System.out.println(bankAccountOne.withdaraw(200));
		
	}

}
