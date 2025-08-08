package com.wipro.orderms.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.wipro.orderms.dto.OrderResponseDTO;
import com.wipro.orderms.dto.PaymentDTO;
import com.wipro.orderms.entity.Order;
import com.wipro.orderms.repo.OrderRepo;
import com.wipro.orderms.service.OrderService; // ✅ Import your service interface

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderRepo orderRepo;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private OrderService orderService; 

    @PostMapping
    public ResponseEntity<String> createOrder(@RequestBody Order order) {
        orderService.saveOrder(order); 
        return ResponseEntity.status(HttpStatus.CREATED).body("Order created successfully");
    }

    @GetMapping
    public List<OrderResponseDTO> getAllOrdersWithPayments() {
        List<Order> orders = orderRepo.findAll();
        List<OrderResponseDTO> responseList = new ArrayList<>();

        for (Order order : orders) {
            OrderResponseDTO dto = new OrderResponseDTO();
            dto.setOrderNumber(order.getOrderNumber());
            dto.setOrderValue(order.getOrderValue());

            // Call Payment-MS using RestTemplate
            String url = "http://localhost:9011/payment/order/" + order.getId();
            PaymentDTO[] payments = restTemplate.getForObject(url, PaymentDTO[].class);

            dto.setPayment(Arrays.asList(payments));
            responseList.add(dto);
        }

        return responseList;
    }
}
