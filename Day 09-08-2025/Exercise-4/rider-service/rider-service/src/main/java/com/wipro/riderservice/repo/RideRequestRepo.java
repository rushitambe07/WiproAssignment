package com.wipro.riderservice.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import com.wipro.riderservice.entity.RideRequest;

public interface RideRequestRepo extends JpaRepository<RideRequest, Integer> {
}