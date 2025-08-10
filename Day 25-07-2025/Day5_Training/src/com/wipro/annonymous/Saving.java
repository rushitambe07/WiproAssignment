package com.wipro.annonymous;


public class Saving {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankOps savings = new BankOps() {
			
            @Override
            public void deposit(double amount) {
                System.out.println("Depositing " + amount + " into Savings Account.");
            }
		};
		
		BankOps current = new BankOps() {
            public void deposit(double amount) {
                System.out.println("Depositing " + amount + " into Current Account.");
            }
        };

        savings.deposit(3000);
        current.deposit(7000);

	}

}
