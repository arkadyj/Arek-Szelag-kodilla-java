package com.kodilla.good.patterns.food2Door;

public class Manufacture implements ProcessRunner {

    private String manufactureName;


    public Manufacture(String manufactureName) {
        this.manufactureName = manufactureName;
    }

    public String getManufactureName() {
        return manufactureName;
    }

    public void process(){
        System.out.println("Order process specific for manufacture " + manufactureName);

    }

}
