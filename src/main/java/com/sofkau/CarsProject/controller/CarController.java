package com.sofkau.CarsProject.controller;

import com.sofkau.CarsProject.entities.CarEntity;
import com.sofkau.CarsProject.services.ICarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/cars")
public class CarController {

    @Autowired
    private ICarService service;

    @CrossOrigin
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

    @CrossOrigin
    @PostMapping(value="/saveCar")
    public  HttpEntity<Object> saveCar(@Valid @RequestBody CarEntity carEntity, BindingResult result){
        if(result.hasErrors()){
            return new ResponseEntity<>("Error al ingresar la informacion", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(service.saveCar(carEntity),HttpStatus.CREATED);
    }

    @CrossOrigin
    @PutMapping(value="/updateCar")
    public ResponseEntity<CarEntity> updateCar(@RequestBody CarEntity carEntity){
        return new ResponseEntity<>(service.updateCar(carEntity),HttpStatus.OK);
    }

    @CrossOrigin
    @DeleteMapping(value="deleteCar/{id}")
    public void deleteCar(@PathVariable int id){
        service.deleteCarById(id);
    }


}
