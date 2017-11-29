package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriver {

    public OrderRequest Retrieve() {

        User user = new User("Kowaczew", "Ray");
        Item item = new Item("Parawan plażowy");
        LocalDateTime orderDate = LocalDateTime.now();

        return new OrderRequest(user, item, orderDate);
    }
}
