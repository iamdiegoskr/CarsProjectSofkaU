package com.sofkau.CarsProject.services;

import com.sofkau.CarsProject.entities.CarEntity;

import java.util.List;
import java.util.Optional;

public interface ICarService {
    public List<CarEntity> listCarsAll();
    public Optional<CarEntity> carById(int id);
    public CarEntity saveCar(CarEntity carEntity);
    public void deleteCarById(int id);
    public CarEntity updateCar(CarEntity carEntity);
}
