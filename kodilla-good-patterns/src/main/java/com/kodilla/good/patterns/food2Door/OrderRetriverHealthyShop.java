package com.kodilla.good.patterns.food2Door;

import java.time.LocalDateTime;

public class OrderRetriverHealthyShop {


    public OrderRequest retriveDataHealthyShop() {

        Product product = new Product("Sugar - ksylitol 1kg", 7.5);
        Order orders = new Order(product, LocalDateTime.now(), 9);

        return new OrderRequest(orders);
    }
}
