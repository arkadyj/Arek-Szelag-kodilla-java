package com.kodilla.patterns2.observer.homework;

public class KodillaStudent extends TaskQueue {
    private String username;
    //private TaskQueue taskQueue;

    public KodillaStudent(String username) {
        super();
        this.username=username;

    }

    public String getUsername() {
        return username;
    }


}
