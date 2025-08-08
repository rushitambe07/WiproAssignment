package com.wipro.paymentms.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.wipro.paymentms.entity.Payment;
import com.wipro.paymentms.service.PaymentService;

import org.springframework.http.HttpHeaders;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public ResponseEntity<String> createPayment(@RequestBody Payment payment) {
        paymentService.savePayment(payment);
        HttpHeaders headers = new HttpHeaders();
        headers.add("created-at", LocalDate.now().toString());
		paymentService.savePayment(payment);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .headers(headers)
                .body("Data Saved Successfully");
    }
    

    @GetMapping
    public ResponseEntity<?> getAllPayments() {
        List<Payment> payments = paymentService.getAllPayments();

        HttpHeaders headers = new HttpHeaders();
        headers.add("search-time", LocalDateTime.now().toString());

        if (payments.isEmpty()) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .headers(headers)
                    .body("No data found");
        }
        return ResponseEntity
                .ok()
                .headers(headers)
                .body(payments);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getPaymentById(@PathVariable int id) {
        Payment payment = paymentService.getPaymentById(id);

        HttpHeaders headers = new HttpHeaders(null);
        headers.add("search-time", LocalDateTime.now().toString());

        if (payment == null) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .headers(headers)
                    .body("Payment not found with id: " + id);
        }
        return ResponseEntity
                .ok()
                .headers(headers)
                .body(payment);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updatePayment(@PathVariable int id, @RequestBody Payment payment) {
        Payment updated = paymentService.updatePayment(id, payment);
        if (updated == null) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("Payment not found to update");
        }
        return ResponseEntity
                .ok("Data Modified Successfully");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePayment(@PathVariable int id) {
        Payment existing = paymentService.getPaymentById(id);
        if (existing == null) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("Payment not found to delete");
        }
        paymentService.deletePayment(id);
        return ResponseEntity
                .ok("Data Deleted Successfully");
    }
}
