package com.kodilla.good.patterns.food2DoorVer2;

public class OrderRetrieverGlutenFreeShop {


    public AuxiliaryOrderRetriever retrieveOrder() {

        Product product = new Product("Gluten free flour", 7.3);
        int quantity = 15;
        return new AuxiliaryOrderRetriever(product, quantity);
    }
}
