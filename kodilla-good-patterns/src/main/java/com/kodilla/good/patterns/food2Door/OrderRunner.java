package com.kodilla.good.patterns.food2Door;

public class OrderRunner implements OrderService {

    public boolean order( Manufacture manufacture, Product product, Orders orders) {
        System.out.println(" Order number: " + orders.getNumber() + " order date: " + orders.getOrderDate().toString() +
        " Manufacture: " + manufacture.getManufactureName() + " product name: " + product.getProductName() +
        " product quantity" + orders.getQuantity() + " order value: " + product.getItemCost()*orders.getQuantity());
        return true;

    }
}
