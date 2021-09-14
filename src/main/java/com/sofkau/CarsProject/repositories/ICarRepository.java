package com.sofkau.CarsProject.repositories;

import com.sofkau.CarsProject.entities.CarEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICarRepository extends CrudRepository<CarEntity, Integer> {
}
