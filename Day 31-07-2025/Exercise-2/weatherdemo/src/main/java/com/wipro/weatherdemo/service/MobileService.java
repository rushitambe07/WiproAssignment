package com.wipro.weatherdemo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.weatherdemo.MobileDTO;
import com.wipro.weatherdemo.repo.MobileRepository;

import java.util.List;

@Service
public class MobileService {

    @Autowired
     MobileRepository repository;

    public void createMobile(MobileDTO mobile) {
        repository.save(mobile);
    }

    public List<MobileDTO> getMobiles() {
        return repository.findAll();
    }

    public void updateMobile(MobileDTO mobile) {
        repository.update(mobile);
    }

    public void deleteMobile(int id) {
        repository.deleteById(id);
    }
}
