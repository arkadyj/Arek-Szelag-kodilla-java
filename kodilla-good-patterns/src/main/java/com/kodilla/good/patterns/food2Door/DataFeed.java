package com.kodilla.good.patterns.food2Door;

public class DataFeed {

    public void dataFeedProcess (ProcessOrderRunner processOrderRunner){

        processOrderRunner.process(new OrderRetriverExtraFoodShop().retrieveDataExtraFoodShop());
    }
}
