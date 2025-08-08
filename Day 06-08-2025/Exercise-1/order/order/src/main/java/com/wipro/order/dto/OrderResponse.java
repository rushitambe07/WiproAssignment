package com.wipro.order.dto;


import com.wipro.order.entity.Order;

public class OrderResponse {

    private Order order;
    private Payment payment;

    
    public OrderResponse() {}

    public OrderResponse(Order order, Payment payment) {
        this.order = order;
        this.payment = payment;
    }

    // Getters and Setters
    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}

