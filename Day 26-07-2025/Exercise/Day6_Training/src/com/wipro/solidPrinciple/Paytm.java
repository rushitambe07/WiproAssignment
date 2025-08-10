package com.wipro.solidPrinciple;

public class Paytm implements PaymentGateway{

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
        System.out.println(amount + " Paytm");

		
	}

}
