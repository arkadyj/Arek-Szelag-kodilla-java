package com.kodilla.good.patterns.food2DoorVer2;

import java.util.ArrayList;
import java.util.List;

public class GlutenFreeShop implements ProcessOrderRunner {


    private final String manufactureName = "GlutenFreeShop";
    List<OrderRepositoryObject> glutenFreeShopOrders = new ArrayList<>();

    public String getManufactureName() {
        return manufactureName;
    }

    public GlutenFreeShop() {
    }

    public void process(Order order) {

        //implementacja czy można realizować zamówienie
        boolean canExecuteOrder = true;

        System.out.println("Specific order process implementation for GlutenFreeShop");

        if (canExecuteOrder) {
            System.out.println("Proceeding order GlutenFreeShop");
            glutenFreeShopOrders.add(new OrderRepositoryObject(manufactureName, order, true));

        } else {
            System.out.println("Order canceled");
            glutenFreeShopOrders.add(new OrderRepositoryObject(manufactureName, order, false));
        }
        System.out.println(order + "\n");
    }
}