package com.wipro.jwtdemo.controller;

import java.time.LocalDateTime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeController {

    @GetMapping("/getCurrentTime")
    public String getCurrentTime() {
        return "Current Date-Time: " + LocalDateTime.now();
    }
}
