package com.wipro.solidPrinciple;

public class DigitalPaymentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentService ser1 = new PaymentService(new GooglePay());
		ser1.makePayment(1000);
		
		PaymentService ser2 = new PaymentService(new PhonePe());
		ser2.makePayment(500);
		
		PaymentService ser3 = new PaymentService(new Paytm());
		ser3.makePayment(200);
	}

}
