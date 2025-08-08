package com.wipro.payments.service;

import java.util.List;
import java.util.Optional;
import com.wipro.payments.entity.Payment;

public interface PaymentService {

	void save(Payment order);
	List<Payment> findAll();
	public Payment findByOrderId(int orderId);

}

