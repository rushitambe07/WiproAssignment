package com.wipro.weatherdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.wipro.weatherdemo.MobileDTO;
import com.wipro.weatherdemo.service.MobileService;

import java.util.List;

@RestController
@RequestMapping("/mobile")
public class MobileController {

    @Autowired
    MobileService service;

    @PostMapping
    public String receiveMobile(@RequestBody MobileDTO mobile) {
        service.createMobile(mobile);
        return "Mobile data received!";
        
    }

    @GetMapping
    public List<MobileDTO> getMobiles() {
        return service.getMobiles();
    }

    @PutMapping
    public String updateMobile(@RequestBody MobileDTO mobile) {
        service.updateMobile(mobile);
        return "Mobile Updated!";
    }

    @DeleteMapping("/{id}")
    public String deleteMobile(@PathVariable int id) {
        System.out.println("Deleting mobile with id: " + id);
        return "Mobile with id " + id + " deleted!";
    }

}


