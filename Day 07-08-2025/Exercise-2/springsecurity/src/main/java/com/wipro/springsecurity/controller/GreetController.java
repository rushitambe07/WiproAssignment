package com.wipro.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
	
	@GetMapping("/greet")
	String voidGreet() {
		return "Hello from Greet";
	}
	
	@GetMapping("/hello")
    public String hello() {
        return "This is public!";
    }

    @GetMapping("/secure")
    public String secure() {
        return "You are authenticated!";
    }


}
