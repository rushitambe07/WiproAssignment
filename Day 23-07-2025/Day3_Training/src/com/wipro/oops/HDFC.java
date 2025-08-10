package com.wipro.oops;

public class HDFC implements BankOps {
    double balance = 1000;

    public void deposit(double amount, String accNumber) {
        balance += amount;
        System.out.println("HDFC: Deposited " + amount + " to account " + accNumber);
    }

    public double depositAndReturnBalance(double amount, String accNumber) {
        balance += amount;
        return balance;
    }

    public double withdraw(double amount, String accNumber) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("HDFC: Withdrawn " + amount + " from account " + accNumber);
        } else {
            System.out.println("HDFC: Insufficient balance!");
        }
        return balance;
    }
}
