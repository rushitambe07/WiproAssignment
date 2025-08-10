package com.wipro.oops;

public interface BankOps {

	void deposit(double amount, String accNumber);
    double depositAndReturnBalance(double amount, String accNumber);
    double withdraw(double amount, String accNumber);
}
