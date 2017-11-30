package com.kodilla.good.patterns.food2Door;

public class Application {

    public static void main(String[] args) {




        DataFeed dataFeed = new DataFeed();
        OrderRunner orderRunner = new OrderRunner();
        dataFeed.dataFeedProcess(new ExtraFoodShop(orderRunner, new Archivizer()));

    }
}

