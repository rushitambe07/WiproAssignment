package com.wipro.order.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.order.entity.Order;

public interface OrderRepo extends JpaRepository<Order, Integer> {
}
