package com.kodilla.patterns2.observer.homework;

public class KodillaMentor implements Observer {
    private String username;

    public KodillaMentor(String username) {
        this.username = username;
    }

    @Override
    public void update (TaskQueue taskQueue) {
        System.out.println(" task: " + taskQueue.getTaskQueue().getLast());
    }
}
