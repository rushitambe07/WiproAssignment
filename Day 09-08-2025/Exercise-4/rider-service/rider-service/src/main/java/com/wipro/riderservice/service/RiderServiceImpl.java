package com.wipro.riderservice.service;


import java.time.LocalDateTime;
import java.util.Optional;

import com.wipro.riderservice.dto.Ride;
import com.wipro.riderservice.entity.RideRequest;
import com.wipro.riderservice.repo.RideRequestRepo;
import com.wipro.riderservice.util.AppConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class RiderServiceImpl implements RiderService {

    @Autowired
    private RideRequestRepo repo;

    @Autowired
    private KafkaTemplate<String, Ride> kafkaTemplate;

    @Override
    public RideRequest save(RideRequest r) {
        r.setStatus("PENDING");
        r.setTimestamp(LocalDateTime.now());
        RideRequest saved = repo.save(r);

        Ride msg = new Ride();
        msg.setId(saved.getId());
        msg.setRiderName(saved.getRiderName());
        msg.setPickup(saved.getPickup());
        msg.setDropLocation(saved.getDropLocation());
        msg.setStatus(saved.getStatus());
        msg.setTimestamp(saved.getTimestamp());

        kafkaTemplate.send(AppConstant.OUTGOING_TOPIC_NAME, msg);
        return saved;
    }

    @KafkaListener(topics = AppConstant.INCOMING_TOPIC_NAME, groupId = "rider_group", containerFactory = "kafkaListenerContainerFactory")
    public void receiveFromUber(Ride ride) {
        System.out.println("[Rider] Message received: " + ride);
        Optional<RideRequest> opt = repo.findById(ride.getId());
        if(opt.isPresent()) {
            RideRequest r = opt.get();
            r.setStatus(ride.getStatus());
            repo.save(r);
        }
    }
}
