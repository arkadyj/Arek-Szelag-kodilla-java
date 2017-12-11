package com.kodilla.spring.moje;

import org.springframework.stereotype.Service;


public class Car {

    private String model;
    private int doors;

    public Car(String model, int doors) {
        this.model = model;
        this.doors = doors;
    }

    public void makeCar() {
        System.out.println("I'm a car");
    }

    public String getModel() {
        return model;
    }

    public int getDoors() {
        return doors;
    }
}
