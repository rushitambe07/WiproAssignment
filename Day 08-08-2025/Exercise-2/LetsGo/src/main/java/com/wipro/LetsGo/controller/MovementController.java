package com.wipro.LetsGo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.LetsGo.entity.VehicleMovement;
import com.wipro.LetsGo.repo.VehicleMovementRepository;

@RestController
public class MovementController {

    @Autowired
    private VehicleMovementRepository repository;

    @PostMapping("/move")
    public String move(@RequestBody VehicleMovement vm) {
        repository.save(vm);
        return "Movement saved for vehicle ID: " + vm.getVehId();
    }
}