package com.wipro.solidPrinciple;

public class PhonePe implements PaymentGateway{

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
        System.out.println(amount + " PhonePay");

		
	}

}
