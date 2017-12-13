package com.kodilla.patterns.factory.tasks;

import java.util.HashMap;
import java.util.Map;

public class Repository {

    private Map<Task, Boolean> taskMap = new HashMap<>();

    public void addToRepository(Task task, Boolean result) {
        taskMap.put(task, result);
    }

    public Map<Task, Boolean> getTaskMap() {
        return taskMap;
    }
}
