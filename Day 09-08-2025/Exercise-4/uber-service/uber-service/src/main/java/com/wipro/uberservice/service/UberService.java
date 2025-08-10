package com.wipro.uberservice.service;


import com.wipro.uberservice.dto.Ride;
import com.wipro.uberservice.entity.AcceptedRide;

public interface UberService {
    void processRide(Ride ride);
}