package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderDto {

    private User user;
    private Item item;
    private LocalDateTime orderDate;
    public boolean isOrdered;

    public OrderDto(User user, Item item, LocalDateTime orderDate, boolean isOrdered) {
        this.user = user;
        this.item = item;
        this.isOrdered=isOrdered;
        this.orderDate=orderDate;
    }

    public User getUser() {
        return user;
    }

    public Item getItem() {
        return item;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
