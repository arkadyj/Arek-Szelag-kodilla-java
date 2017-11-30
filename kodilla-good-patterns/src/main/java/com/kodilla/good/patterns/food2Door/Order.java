package com.kodilla.good.patterns.food2Door;

import java.time.LocalDateTime;

public class Order {

    private Product product;
    static private int number = 0;
    private LocalDateTime orderDate;
    private int quantity;

    public Order (Product product, LocalDateTime orderDate, int quantity) {
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
                " orderDate= " + orderDate +
                ", quantity= " + quantity +
                '}';
    }
}


