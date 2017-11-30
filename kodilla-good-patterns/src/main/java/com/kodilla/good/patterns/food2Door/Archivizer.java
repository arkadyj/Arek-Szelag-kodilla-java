package com.kodilla.good.patterns.food2Door;

import java.util.ArrayList;
import java.util.List;

public class Archivizer implements OrdersArchivizer {
    private List<ManufactureProductOrderDto> ordersList = new ArrayList<>();

    public void orderToArchive( ManufactureProductOrderDto manufactureProductOrderDto) {
        ordersList.add(manufactureProductOrderDto);
    }
}
