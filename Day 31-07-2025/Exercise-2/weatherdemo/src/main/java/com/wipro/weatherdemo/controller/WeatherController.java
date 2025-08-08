package com.wipro.weatherdemo.controller;


import org.springframework.web.bind.annotation.*;

@RestController
public class WeatherController {

    @GetMapping("/weather")
    public String getWeather(@RequestParam String city, @RequestParam String day) {
        return "Weather in " + city + " for " + day + " is cloudy.";
    }
    
    @GetMapping("/tocentigrade/{fahrenheit}")
    public String convertToCentigrade(@PathVariable double fahrenheit) {
        double centigrade = (fahrenheit - 32) * 5.0 / 9.0;
        return fahrenheit + "°F = " + String.format("%.2f", centigrade) + "°C";
    }
}

