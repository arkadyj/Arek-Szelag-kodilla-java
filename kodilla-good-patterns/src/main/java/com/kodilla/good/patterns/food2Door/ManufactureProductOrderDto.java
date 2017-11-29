package com.kodilla.good.patterns.food2Door;

public class ManufactureProductOrderDto {

    private Manufacture manufacture;
    private Product product;
    private Orders orders;
    private boolean orderResult;

    public ManufactureProductOrderDto(Manufacture manufacture, Product product, Orders orders, boolean orderResult) {
        this.manufacture = manufacture;
        this.product = product;
        this.orders = orders;
        this.orderResult = orderResult;
    }

    public Manufacture getManufacture() {
        return manufacture;
    }

    public Product getProduct() {
        return product;
    }

    public Orders getOrders() {
        return orders;
    }

    public boolean isOrderResult() {
        return orderResult;
    }
}
