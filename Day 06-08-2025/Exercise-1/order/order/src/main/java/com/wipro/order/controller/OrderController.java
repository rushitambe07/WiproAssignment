package com.wipro.order.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.order.dto.OrderResponse;
import com.wipro.order.entity.Order;
import com.wipro.order.service.OrderService;


@RestController
@RequestMapping("/orders")
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@PostMapping
	void save(@RequestBody Order order)
	{
		
		orderService.save(order);
		
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<OrderResponse> getOrderWithPayment(@PathVariable("id") int id) {
	    OrderResponse response = orderService.getOrderWithPayment(id);
	    if (response == null) {
	        return ResponseEntity.notFound().build();
	    }
	    return ResponseEntity.ok(response);
	}


	@GetMapping
	List<Order> findAll()
	{
		return orderService.findAll();
	}
}