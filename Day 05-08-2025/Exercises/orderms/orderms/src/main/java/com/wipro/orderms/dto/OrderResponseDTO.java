package com.wipro.orderms.dto;

import java.util.List;

public class OrderResponseDTO {
    private String orderNumber;
    private double orderValue;
    private List<PaymentDTO> payment;
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public double getOrderValue() {
		return orderValue;
	}
	public void setOrderValue(double orderValue) {
		this.orderValue = orderValue;
	}
	public List<PaymentDTO> getPayment() {
		return payment;
	}
	public void setPayment(List<PaymentDTO> payment) {
		this.payment = payment;
	}

}
