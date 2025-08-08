package com.wipro.carmicroservice.service;

import java.util.List;

import com.wipro.carmicroservice.entity.Car;

public interface CarService {
	Car saveCar(Car car);
    List<Car> getAllCars();
    Car getCarById(Long id);
    Car updateCar(Long id, Car car);
    void deleteCar(Long id);

}
