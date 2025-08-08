package com.wipro.carmicroservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.carmicroservice.entity.Car;
import com.wipro.carmicroservice.repo.CarRepository;
import com.wipro.carmicroservice.service.CarService;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepository carRepository;

    @Override
    public Car saveCar(Car car) {
        return carRepository.save(car);
    }

    @Override
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    @Override
    public Car getCarById(Long id) {
        return carRepository.findById(id).orElse(null);
    }

    @Override
    public Car updateCar(Long id, Car car) {
        Car existing = carRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setMake(car.getMake());
            existing.setRegistrationDetail(car.getRegistrationDetail());
            return carRepository.save(existing);
        }
        return null;
    }

    @Override
    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }
}
