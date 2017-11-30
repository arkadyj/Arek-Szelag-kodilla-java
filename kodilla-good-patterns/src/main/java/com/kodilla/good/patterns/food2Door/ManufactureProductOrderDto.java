package com.kodilla.good.patterns.food2Door;

public class ManufactureProductOrderDto {

    private String manufacture;
    private Order order;
    private double manufactureMargin;
    private boolean orderResult;

    public ManufactureProductOrderDto(String manufacture, Product product, Order order, double manufactureMargin, boolean orderResult) {
        this.manufacture = manufacture;
        this.order = order;
        this.manufactureMargin = manufactureMargin;
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
