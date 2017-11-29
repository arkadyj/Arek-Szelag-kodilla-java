package com.kodilla.good.patterns.food2Door;

import java.util.ArrayList;
import java.util.List;

public class Archivizer implements OrdersArchivizer {

    public void orderToArchive( ManufactureProductOrderDto manufactureProductOrderDto) {
        List<ManufactureProductOrderDto> ordersList = new ArrayList<>();
        ordersList.add(manufactureProductOrderDto);
    }
}
