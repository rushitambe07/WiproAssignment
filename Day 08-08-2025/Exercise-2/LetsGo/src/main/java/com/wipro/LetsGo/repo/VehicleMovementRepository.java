package com.wipro.LetsGo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.LetsGo.entity.VehicleMovement;

public interface VehicleMovementRepository extends JpaRepository<VehicleMovement, Integer>{

}
