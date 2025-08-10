package com.wipro.producer.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.consumer.dto.Learn;
import com.wipro.producer.service.LearnService;


@RestController
@RequestMapping("/learn")
public class LearnController {
	
	@Autowired
	LearnService learnService;
	
	@PostMapping
	void sendData(@RequestBody Learn learn) {
		learnService.sendData(learn);
	}

}