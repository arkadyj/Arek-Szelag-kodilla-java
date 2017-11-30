package com.kodilla.good.patterns.food2Door;

public class HealthyShop implements ProcessOrderRunner {

    private final String manufactureName = "HealthyShop";
    private OrderServiceFood orderServiceFood;
    private OrdersArchivizer ordersArchivizer;
    private double manufactureMargin = 0.99;

    public HealthyShop(OrderServiceFood orderServiceFood, OrdersArchivizer ordersArchivizer) {
        this.orderServiceFood = orderServiceFood;
        this.ordersArchivizer = ordersArchivizer;
    }

    public void process(final OrderRequest orderRequest) {
        boolean isOrdered = false;

        isOrdered = orderServiceFood.order(orderRequest.getOrders());

        if(isOrdered) {
            System.out.println("HealthyShop special order process.....");
            System.out.println("Special payment for this product: " + orderRequest.getOrders().getProduct().getItemCost()* orderRequest.getOrders().getQuantity()*manufactureMargin);
            ManufactureProductOrderDto manufactureProductOrderDto = new ManufactureProductOrderDto
                    (manufactureName,orderRequest.getOrders().getProduct(),orderRequest.getOrders(),manufactureMargin,isOrdered);
            ordersArchivizer.orderToArchive(manufactureProductOrderDto);
        }
        else {
            System.out.println("ExtraFoodShop order is canceled");
            ManufactureProductOrderDto manufactureProductOrderDto = new ManufactureProductOrderDto
                    (manufactureName,orderRequest.getOrders().getProduct(),orderRequest.getOrders(),manufactureMargin,isOrdered);
            ordersArchivizer.orderToArchive(manufactureProductOrderDto);
        }
    }
}
