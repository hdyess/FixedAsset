package com.pluralsight.finance;

import com.pluralsight.Valuable;

public class BankAccount implements Valuable {

	String name;
	String accountNumber;
	double balance;


	public BankAccount(String name, String accountNumber, double balance) {
		this.name = name;
		this. accountNumber = accountNumber;
		this.balance = balance;
	}


	public void withdraw(double amount) {
		this.balance -= amount;
	}

	public void deposit(double amount) {
		this.balance += amount;
	}

	public double getValue() {
		return this.balance;
	}


}
