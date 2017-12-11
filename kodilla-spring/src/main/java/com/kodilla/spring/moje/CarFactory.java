package com.kodilla.spring.moje;

public class CarFactory {
    private Car car;

    public CarFactory(Car car) {
        this.car = car;
    }

    public void carInfo () {
        System.out.println(car.getModel() + " " + car.getDoors());
    }
}
