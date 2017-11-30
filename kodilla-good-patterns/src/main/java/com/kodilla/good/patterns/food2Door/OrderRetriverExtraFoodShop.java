package com.kodilla.good.patterns.food2Door;

import java.time.LocalDateTime;

public class OrderRetriverExtraFoodShop {


    public OrderRequest retrieveDataExtraFoodShop() {

        Product product = new Product("Apple",5);
        Order orders = new Order(product, LocalDateTime.now(),5);

        return new OrderRequest(orders);
    }



}
