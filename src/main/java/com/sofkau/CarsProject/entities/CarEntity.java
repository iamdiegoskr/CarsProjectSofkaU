package com.sofkau.CarsProject.entities;


import javax.persistence.*;

@Entity
@Table(name = "tbl_car")
public class CarEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String mark;

    private String model;

    private String origin;

    private boolean isElectric;

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
