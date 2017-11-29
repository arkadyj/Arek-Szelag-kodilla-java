package com.kodilla.good.patterns.food2Door;

public class Product {

    private String productName;
    private int itemCost;

    public Product(String productName, int itemCost) {
        this.productName = productName;
        this.itemCost = itemCost;
    }

    public String getProductName() {
        return productName;
    }

    public int getItemCost() {
        return itemCost;
    }
}
