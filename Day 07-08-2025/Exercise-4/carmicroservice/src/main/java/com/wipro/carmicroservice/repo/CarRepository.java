package com.wipro.carmicroservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.carmicroservice.entity.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
}
