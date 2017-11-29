package com.kodilla.good.patterns.food2Door;

import java.time.LocalDateTime;

public class Orders {

    static private int number=0;
    private LocalDateTime orderDate;
    private int quantity;


    public Orders( LocalDateTime orderDate, int quantity) {
        this.number += 1;
        this.orderDate = orderDate;
        this.quantity=quantity;
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
}
