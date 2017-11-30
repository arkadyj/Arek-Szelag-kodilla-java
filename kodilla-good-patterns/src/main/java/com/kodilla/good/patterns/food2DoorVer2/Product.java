package com.kodilla.good.patterns.food2DoorVer2;

public class Product {

    private String productName;
    private double itemCost;

    public Product(String productName, double itemCost) {
        this.productName = productName;
        this.itemCost = itemCost;
    }

    public String getProductName() {
        return productName;
    }

    public double getItemCost() {
        return itemCost;
    }


    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", itemCost=" + itemCost +
                '}';
    }
}