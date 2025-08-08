package com.wipro.paymentms.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.paymentms.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {


}
