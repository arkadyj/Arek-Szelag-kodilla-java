package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class TaskQueue implements Observable {
    private List<Observer> observers;
    private ArrayDeque<String> taskQueue;



    public TaskQueue() {
        observers = new ArrayList<>();
        taskQueue = new ArrayDeque<>();
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public ArrayDeque<String> getTaskQueue() {
        return taskQueue;
    }

    public void addTask(String task){
        taskQueue.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer){
        observers.add(observer);
    }
    @Override
    public void notifyObservers(){
        for (Observer observer:observers) {
            observer.update(this);
        }

    }
}
