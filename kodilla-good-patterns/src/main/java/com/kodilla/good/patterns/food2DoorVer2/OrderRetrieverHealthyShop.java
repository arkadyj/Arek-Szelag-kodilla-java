package com.kodilla.good.patterns.food2DoorVer2;

public class OrderRetrieverHealthyShop {

    public AuxiliaryOrderRetriever retrieveOrder() {

        Product product = new Product("Sugar - ksylitol", 10.2);
        int quantity = 55;
        return new AuxiliaryOrderRetriever(product, quantity);
    }
}
