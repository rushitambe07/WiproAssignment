package com.wipro.order.service;

import com.wipro.order.dto.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "payment-ms")  
public interface PaymentConnectService {

    @PostMapping("/payment") 
    ResponseEntity<Payment> savePaymentData(@RequestBody Payment payment);
    
    @GetMapping("/payment/order/{orderId}")
    Payment getPaymentByOrderId(@PathVariable("orderId") int orderId); 
}
