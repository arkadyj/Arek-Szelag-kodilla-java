package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Messanger implements InformationService {

    public void notification(User user, Item item, LocalDateTime localDateTime) {
        DateTimeFormatter dataTimeFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Message has been send to: " + user.getSname() + " " + user.getFname()
                + " ordered item: " + item.getName() + " day: " + localDateTime.format(dataTimeFormat));
    }
}
