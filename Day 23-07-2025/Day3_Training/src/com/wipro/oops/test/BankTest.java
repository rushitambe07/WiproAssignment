package com.wipro.oops.test;

import com.wipro.oops.HDFC;
import com.wipro.oops.Citi;

public class BankTest {
    public static void main(String[] args) {
        HDFC hdfc = new HDFC();
        hdfc.deposit(500, "HDFC123");
        hdfc.withdraw(300, "HDFC123");
        System.out.println("HDFC Final Balance: " + hdfc.depositAndReturnBalance(0, "HDFC123"));

        System.out.println();

        Citi citi = new Citi();
        citi.deposit(400, "CITI456");
        citi.withdraw(800, "CITI456"); 
        System.out.println("Citi Final Balance: " + citi.depositAndReturnBalance(0, "CITI456"));
    }
}
