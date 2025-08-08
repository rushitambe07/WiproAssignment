package com.wipro.paymentms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.paymentms.entity.Payment;
import com.wipro.paymentms.repo.PaymentRepository;
import com.wipro.paymentms.service.PaymentService;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public Payment savePayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    @Override
    public Payment getPaymentById(int id) {
        Optional<Payment> optional = paymentRepository.findById(id);
        return optional.orElse(null);
    }

    @Override
    public Payment updatePayment(int id, Payment updatedPayment) {
        Optional<Payment> optional = paymentRepository.findById(id);
        if (optional.isPresent()) {
            Payment existing = optional.get();
            existing.setPaymentMode(updatedPayment.getPaymentMode());
            existing.setAmount(updatedPayment.getAmount());
            existing.setDescription(updatedPayment.getDescription());
            return paymentRepository.save(existing);
        }
        return null;
    }

    @Override
    public void deletePayment(int id) {
        paymentRepository.deleteById(id);
    }

	

	
}
