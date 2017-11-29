package com.kodilla.good.patterns.challenges;

public class RunApp {

    public static void main(String[] args) {

        OrderRequestRetriver orderRequestRetriever = new OrderRequestRetriver();
        OrderRequest orderRequest = orderRequestRetriever.Retrieve();

        ProductOrderService productOrderService = new ProductOrderService(
                new OrderToRepository(), new OrderItem(), new Messanger());

        productOrderService.process(orderRequest);
    }
}
