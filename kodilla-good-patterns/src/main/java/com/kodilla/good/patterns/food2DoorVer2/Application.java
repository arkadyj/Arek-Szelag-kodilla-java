package com.kodilla.good.patterns.food2DoorVer2;

public class Application {

    public static void main(String[] args) {

        OrderRetrieverExtraFoodShop orderExtraFoodShop = new OrderRetrieverExtraFoodShop();
        PreparingOrder preparingOrder = new PreparingOrder(new ExtraFoodShop());
        preparingOrder.processOrderCreator(orderExtraFoodShop.retrieveOrder());

        OrderRetrieverHealthyShop orderHealthyShop = new OrderRetrieverHealthyShop();
        PreparingOrder preparingOrderHealthyShop = new PreparingOrder(new HealthyShop());
        preparingOrderHealthyShop.processOrderCreator(orderHealthyShop.retrieveOrder());

        OrderRetrieverGlutenFreeShop orderGlutenFreeShop = new OrderRetrieverGlutenFreeShop();
        PreparingOrder preparingOrderGlutenFreeShop = new PreparingOrder(new GlutenFreeShop());
        preparingOrderGlutenFreeShop.processOrderCreator(orderGlutenFreeShop.retrieveOrder());


    }
}
