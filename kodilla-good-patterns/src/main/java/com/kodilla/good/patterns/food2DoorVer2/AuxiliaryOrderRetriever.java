package com.kodilla.good.patterns.food2DoorVer2;

public class AuxiliaryOrderRetriever {

    private Product product;
    private int quantity;

    public AuxiliaryOrderRetriever(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
