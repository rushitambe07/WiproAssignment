package com.wipro.orderms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.orderms.entity.Order;

public interface OrderRepo extends JpaRepository<Order, Integer> {
}