package com.kodilla.patterns2.observer.homework;

public class KodillaStudent {
    private String username;
    private Queue queue;

    public KodillaStudent(String username) {
        queue = new Queue();
        this.username=username;

    }

    public Queue getQueue() {
        return queue;
    }

    public String getUsername() {
        return username;
    }


}
