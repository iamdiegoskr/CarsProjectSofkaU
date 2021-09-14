package com.sofkau.CarsProject.services;

import com.sofkau.CarsProject.entities.CarEntity;

import java.util.List;

public interface ICarService {
    public List<CarEntity> listCarsAll();
    public CarEntity carById(int id);
    public CarEntity saveCar(CarEntity carEntity);
    public void deleteCarById(int id);
    public CarEntity updateCar(CarEntity carEntity);
}
