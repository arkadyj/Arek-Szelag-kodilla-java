package com.kodilla.good.patterns.food2DoorVer2;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Order {

    private Product product;
    static private int number = 0;
    private LocalDateTime orderDate;
    private int quantity;
    DateTimeFormatter dataTimeFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public Order(Product product, LocalDateTime orderDate, int quantity) {
        this.number += 1;
        this.orderDate = orderDate;
        this.quantity = quantity;
        this.product = product;
    }

    public int getNumber() {
        return number;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "order number= " + number +
                ", orderDate= " + orderDate.format(dataTimeFormat) +
                ", product name= " + product.getProductName() +
                ", quantity= " + quantity +
                ", product price " + product.getItemCost() +
                ", order value " + quantity * product.getItemCost() +
                '}';
    }
}