package com.wipro.solidPrinciple;

public class PaymentService {
	PaymentGateway gateway;

	public PaymentService(PaymentGateway gateway) {
		
		this.gateway = gateway;
	}
	
	public void makePayment(double amount) {
		gateway.pay(amount);
	}
}
