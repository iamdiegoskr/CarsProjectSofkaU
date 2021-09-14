package com.sofkau.CarsProject.services;

import com.sofkau.CarsProject.entities.CarEntity;
import com.sofkau.CarsProject.repositories.ICarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService implements ICarService {

    @Autowired
    private ICarRepository data;

    @Override
    public List<CarEntity> listCarsAll() {
        return null;
    }

    @Override
    public CarEntity carById(int id) {
        return null;
    }

    @Override
    public CarEntity saveCar(CarEntity carEntity) {
        return null;
    }

    @Override
    public void deleteCarById(int id) {

    }

    @Override
    public CarEntity updateCar(CarEntity carEntity) {
        return null;
    }
}
