package com.wipro.order.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.wipro.order.dto.OrderResponse;
import com.wipro.order.dto.Payment;
import com.wipro.order.entity.Order;
import com.wipro.order.repo.OrderRepo;
import com.wipro.order.service.OrderService;
import com.wipro.order.service.PaymentConnectService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepo orderRepo;

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    PaymentConnectService paymentConnectService;

    @Override
    public OrderResponse getOrderWithPayment(int orderId) {
        Order order = orderRepo.findById(orderId).orElse(null);
        if (order == null) {
            return null;
        }

        Payment payment = paymentConnectService.getPaymentByOrderId(orderId);
        return new OrderResponse(order, payment);
    }

    // Circuit breaker for saving order and calling Payment-MS
    @Override
    @CircuitBreaker(name = "order-cb", fallbackMethod = "handleFallBack")
    public void save(Order order) {
        order.setOrderStatus("Insert");
        orderRepo.save(order);

        // Payment setup
        Payment payment = new Payment();
        payment.setOrderId(order.getId());
        payment.setPaymentAmount(order.getOrderValue());
        payment.setPaymentStatus(true);

        // Call Payment-MS via service
        ResponseEntity<Payment> response = paymentConnectService.savePaymentData(payment);
        if (response.getStatusCode().value() == 200) {
            order.setOrderStatus("Success");
        }

        orderRepo.save(order);
    }

    // Fallback method for circuit breaker
    public void handleFallBack(Order order, Throwable t) {
        System.out.println("-- Fallback: Payment-MS is down --");
        order.setOrderStatus("Failed - Payment Service Down");
        orderRepo.save(order);
    }

    @Override
    public List<Order> findAll() {
        return orderRepo.findAll();
    }
}
