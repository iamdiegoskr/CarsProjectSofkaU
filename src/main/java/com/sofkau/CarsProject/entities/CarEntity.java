package com.sofkau.CarsProject.entities;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tbl_car")
public class CarEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "Debes especificar la marca del coche")
    private String mark;

    @NotEmpty(message = "Debes especificar el model del coche")
    private String model;

    @NotEmpty(message = "Debes especificar el origen del coche")
    private String origin;

    @NotNull(message = "Debes especificar si es electrico o no")
    private boolean isElectric;

    @NotEmpty(message = "Debes especificar la capacidad")
    private String cylinder_capacity;

    public CarEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public String getCylinder_capacity() {
        return cylinder_capacity;
    }

    public void setCylinder_capacity(String cylinder_capacity) {
        this.cylinder_capacity = cylinder_capacity;
    }
}
