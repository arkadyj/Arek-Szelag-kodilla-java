package com.kodilla.good.patterns.food2DoorVer2;

import java.util.ArrayList;
import java.util.List;

public class ExtraFoodShop implements ProcessOrderRunner {

    private final String manufactureName = "ExtraFoodShop";
    List<OrderRepositoryObject> extraFoodShopPrders = new ArrayList<>();

    public ExtraFoodShop() {
    }

    public String getManufactureName() {
        return manufactureName;
    }

    public void process(Order order) {

        //implementacja czy można realizować zamówienie
        boolean canExecuteOrder = true;

        System.out.println("Specific order process implementation for ExtraFoodShop");

        if (canExecuteOrder) {
            System.out.println("Proceeding order ExtraFoodShop");

        } else {
            System.out.println("Order canceled");
            extraFoodShopPrders.add(new OrderRepositoryObject(manufactureName, order, false));
        }
        System.out.println(order + "\n");


    }
}
