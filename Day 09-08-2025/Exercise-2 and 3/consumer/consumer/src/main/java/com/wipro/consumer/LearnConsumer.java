package com.wipro.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.wipro.consumer.dto.Learn;


@Component
public class LearnConsumer {
	
	@KafkaListener(topics = "learn-subject", groupId = "group_id")
    public void consume(Learn learn) {
        System.out.println("Consumed message: " + learn);
    }

}