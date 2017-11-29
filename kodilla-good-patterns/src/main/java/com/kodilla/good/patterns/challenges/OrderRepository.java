package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface OrderRepository {

    public void addOrderToDatabase(User user, Item item, LocalDateTime localDateTime, boolean result);
}
