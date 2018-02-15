package com.kodilla.patterns2.observer.homework;

public class KodillaMentor implements Observer {
    private String username;

    public KodillaMentor(String username) {
        this.username = username;
    }

    @Override
    public void update(Queue queue) {
        System.out.println(username + ": task to check - " + queue.getTaskQueue().getLast());
    }
}
