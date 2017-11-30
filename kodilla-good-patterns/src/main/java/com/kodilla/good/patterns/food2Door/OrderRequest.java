package com.kodilla.good.patterns.food2Door;

public class OrderRequest {

    public Order orders;

    public OrderRequest(Order orders) {
        this.orders = orders;
    }

    public Order getOrders() {
        return orders;
    }

}

