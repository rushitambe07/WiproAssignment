package com.wipro.thymeleafdemo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	@GetMapping("/hello")
	String showWelcome(Model m)
	{
		m.addAttribute("name", "Rushikesh");
		m.addAttribute("play", "Football");
		return "index";		
	}

}
