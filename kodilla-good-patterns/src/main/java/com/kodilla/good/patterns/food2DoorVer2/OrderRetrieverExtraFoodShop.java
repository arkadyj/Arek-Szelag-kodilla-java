package com.kodilla.good.patterns.food2DoorVer2;

public class OrderRetrieverExtraFoodShop {

    public AuxiliaryOrderRetriever retrieveOrder() {

        Product product = new Product("apple", 10.2);
        int quantity = 21;
        return new AuxiliaryOrderRetriever(product, quantity);
    }
}
