package com.sofkau.CarsProject.controller;

import com.sofkau.CarsProject.entities.CarEntity;
import com.sofkau.CarsProject.services.ICarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/cars")
public class CarController {

    @Autowired
    private ICarService service;

    @GetMapping(value = "/list")
    public List<CarEntity> getAllCars(){
        return service.listCarsAll();
    }

    @GetMapping(value = "/list/{id}")
    public ResponseEntity<CarEntity> getCarById(@PathVariable() int id){
        return service.carById(id)
                .map(carEntity -> new ResponseEntity<>(carEntity, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping(value="/saveCar")
    public  ResponseEntity<CarEntity> saveCar(@RequestBody CarEntity carEntity){
        return new ResponseEntity<>(service.saveCar(carEntity),HttpStatus.CREATED);
    }

    @PutMapping(value="/updateCar")
    public CarEntity updateCar(@RequestBody CarEntity carEntity){
        return service.updateCar(carEntity);
    }

    @DeleteMapping(value="deleteCar/{id}")
    public void deleteCar(@PathVariable int id){
        service.deleteCarById(id);
    }


}
