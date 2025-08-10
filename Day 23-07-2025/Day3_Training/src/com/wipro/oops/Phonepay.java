package com.wipro.oops;

public class Phonepay implements PaymentMethod{

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
        System.out.println("Paid ₹" + amount + " using PhonePe.");

		
	}

}
