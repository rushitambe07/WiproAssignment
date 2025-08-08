package com.wipro.payments.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

import com.wipro.payments.entity.Payment;
import com.wipro.payments.repo.PaymentRepo;
import com.wipro.payments.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    PaymentRepo paymentRepo;

    // Circuit breaker added here
    @Override
    @CircuitBreaker(name = "paymentServiceCB", fallbackMethod = "fallbackFindByOrderId")
    public Payment findByOrderId(int orderId) {
        return paymentRepo.findByOrderId(orderId);
    }

    // Fallback method in case of failure
    public Payment fallbackFindByOrderId(int orderId, Throwable t) {
        Payment fallbackPayment = new Payment();
        fallbackPayment.setOrderId(orderId);
        fallbackPayment.setPaymentAmount(0.0);
        fallbackPayment.setPaymentStatus(false);
        return fallbackPayment;
    }

    @Override
    public void save(Payment payment) {
        paymentRepo.save(payment);
    }

    @Override
    public List<Payment> findAll() {
        return paymentRepo.findAll();
    }
}
