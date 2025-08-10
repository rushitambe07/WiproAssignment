package com.wipro.oops;

public class Citi implements BankOps {
    double balance = 500;

    public void deposit(double amount, String accNumber) {
        balance += amount;
        System.out.println("Citi: Deposited " + amount + " to account " + accNumber);
    }

    public double depositAndReturnBalance(double amount, String accNumber) {
        balance += amount;
        return balance;
    }

    public double withdraw(double amount, String accNumber) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Citi: Withdrawn " + amount + " from account " + accNumber);
        } else {
            System.out.println("Citi: Insufficient balance!");
        }
        return balance;
    }
}
