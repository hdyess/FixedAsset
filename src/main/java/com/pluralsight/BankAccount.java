package com.pluralsight;

public class BankAccount implements Valuable{

	String name;
	String accountNumber;
	double balance;


	BankAccount(String name, String accountNumber, double balance) {
		this.name = name;
		this. accountNumber = accountNumber;
		this.balance = balance;
	}


	public double withdraw() {
	return 0;
	}

	public void deposit() {

	}

	public double getValue() {
		return 0;
	}


}
