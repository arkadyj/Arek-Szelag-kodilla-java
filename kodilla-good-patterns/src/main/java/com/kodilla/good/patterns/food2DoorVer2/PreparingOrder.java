package com.kodilla.good.patterns.food2DoorVer2;

import java.time.LocalDateTime;

public class PreparingOrder {


    private ProcessOrderRunner processOrderRunner;

    public PreparingOrder(ProcessOrderRunner processOrderRunner) {
        this.processOrderRunner = processOrderRunner;
    }

    public void processOrderCreator(AuxiliaryOrderRetriever auxiliaryOrderRetriever) {

        System.out.println("Process of preparing order.");
        processOrderRunner.process(new Order(auxiliaryOrderRetriever.getProduct(), LocalDateTime.now(), auxiliaryOrderRetriever.getQuantity()));
    }
}
