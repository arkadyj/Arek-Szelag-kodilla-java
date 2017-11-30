package com.kodilla.good.patterns.food2DoorVer2;


public class OrderRepositoryObject {

    private String manufacture;
    private Order order;
    private boolean orderResult;

    public OrderRepositoryObject(String manufacture, Order order, boolean orderResult) {
        this.manufacture = manufacture;
        this.order = order;
        this.orderResult = orderResult;
    }

    public String getManufacture() {
        return manufacture;
    }

    public Order getOrders() {
        return order;
    }

    public boolean isOrderResult() {
        return orderResult;
    }

}