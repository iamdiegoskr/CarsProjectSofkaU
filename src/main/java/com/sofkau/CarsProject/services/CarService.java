package com.sofkau.CarsProject.services;

import com.sofkau.CarsProject.entities.CarEntity;
import com.sofkau.CarsProject.repositories.ICarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class CarService implements ICarService {

    @Autowired
    private ICarRepository data;

    @Override
    public List<CarEntity> listCarsAll() {
            return (List<CarEntity>) data.findAll();
    }

    @Override
    public Optional<CarEntity> carById(int id) {
        Optional<CarEntity> carEntity = data.findById(id);

        if (carEntity.isEmpty()) {
            throw new NoSuchElementException("No car found with id provided");
        }
        return carEntity;
    }

    @Override
    public CarEntity saveCar(CarEntity carEntity) {
        Optional<CarEntity> auxCarEntity = data.findById(carEntity.getId());
        if (auxCarEntity.isPresent()) {
            throw new NoSuchElementException("The car with the id provided already exist");
        }
        return data.save(carEntity);
    }

    @Override
    public void deleteCarById(int id) {
        Optional<CarEntity> carEntity = data.findById(id);
        if (carEntity.isEmpty()) {
            new ResponseEntity<>(HttpStatus.NOT_FOUND);
            throw new NoSuchElementException("The car with the id provided doesn't exist. The element was not deleted");
        }
        data.deleteById(id);
    }

    @Override
    public CarEntity updateCar(CarEntity carEntity) {

        Optional<CarEntity> auxCarEntity = data.findById(carEntity.getId());
        if (auxCarEntity.isEmpty()) {
            new ResponseEntity<>(HttpStatus.NOT_FOUND);
            throw new NoSuchElementException("The car with the id provided doesn't exist.");
        }
        return data.save(carEntity);
    }
}
