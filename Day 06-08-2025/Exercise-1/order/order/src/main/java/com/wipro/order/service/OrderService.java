package com.wipro.order.service;


import java.util.List;

import com.wipro.order.dto.OrderResponse;
import com.wipro.order.entity.Order;

public interface OrderService {
	void save(Order order);
	List<Order> findAll();
	OrderResponse getOrderWithPayment(int orderId);

	}

