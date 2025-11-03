package com.pluralsight;

import com.pluralsight.finance.BankAccount;
import com.pluralsight.finance.CreditCard;

public class FinanceApplicaiton {

	public static void main(String[] args) {

		BankAccount account1 = new BankAccount("pam", "123", 12500);
		BankAccount account2 = new BankAccount("gary", "456", 1500);

		// try to deposit money into both accounts
		account1.deposit(100);
		account2.deposit(100);
		






	}


}
