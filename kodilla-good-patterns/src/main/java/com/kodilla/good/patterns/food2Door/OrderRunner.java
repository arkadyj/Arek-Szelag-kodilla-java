package com.kodilla.good.patterns.food2Door;

public class OrderRunner implements OrderServiceFood {

    public boolean order(Order order) {
       System.out.println("Processing order");
       System.out.println(" Order number: " + order.getNumber() + " order date: " + order.getOrderDate().toString() +
        " product name: " + order.getProduct().getProductName() +
        " product quantity" + order.getQuantity() + " order value: " + order.getProduct().getItemCost()*order.getQuantity());
        return true;

    }
}
