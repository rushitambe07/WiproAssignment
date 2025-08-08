package com.wipro.paymentms.service;

import java.util.List;

import com.wipro.paymentms.entity.Payment;

public interface PaymentService {
	Payment savePayment(Payment payment);
    List<Payment> getAllPayments();
    Payment getPaymentById(int id);
    Payment updatePayment(int id, Payment payment);
    void deletePayment(int id);
	

}
