package com.kodilla.good.patterns.food2DoorVer2;

import java.util.ArrayList;
import java.util.List;

public class HealthyShop implements ProcessOrderRunner {

    private final String manufactureName = "HealthyShop";
    List<OrderRepositoryObject> healthyShopOrders = new ArrayList<>();

    public String getManufactureName() {
        return manufactureName;
    }

    public HealthyShop() {
    }

    public void process(Order order) {

        //implementacja czy można realizować zamówienie
        boolean canExecuteOrder = true;

        System.out.println("Specific order process implementation for HealthyShop");

        if (canExecuteOrder) {
            System.out.println("Proceeding order HealthyShop");
            healthyShopOrders.add(new OrderRepositoryObject(manufactureName, order, true));

        } else {
            System.out.println("Order canceled");
            healthyShopOrders.add(new OrderRepositoryObject(manufactureName, order, false));
        }
        System.out.println(order + "\n");
    }
}
