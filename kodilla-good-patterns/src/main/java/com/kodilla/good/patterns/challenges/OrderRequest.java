package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {

    public User user;
    public Item item;
    public LocalDateTime orderDate;


    public OrderRequest(User user, Item item, LocalDateTime localDateTime) {
        this.user = user;
        this.item = item;
        this.orderDate = localDateTime;


    }

    public User getUser() {
        return user;
    }

    public Item getItem() {
        return item;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }
}
