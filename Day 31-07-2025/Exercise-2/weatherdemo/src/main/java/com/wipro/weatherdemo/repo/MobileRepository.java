package com.wipro.weatherdemo.repo;


import org.springframework.stereotype.Repository;

import com.wipro.weatherdemo.MobileDTO;

import java.util.*;

@Repository
public class MobileRepository {
      List<MobileDTO> mobiles = new ArrayList<>();

    public void save(MobileDTO mobile) {
        mobiles.add(mobile);
    }

    public List<MobileDTO> findAll() {
        return mobiles;
    }

    public void update(MobileDTO mobile) {
        for (MobileDTO m : mobiles) {
            if (m.getId() == mobile.getId()) {
                m.setMake(mobile.getMake());
                m.setModelNumber(mobile.getModelNumber());
                m.setPrice(mobile.getPrice());
                break;
            }
        }
    }

    public void deleteById(int id) {
        mobiles.removeIf(m -> m.getId() == id);
    }
}

