package com.kodilla.patterns.factory.tasks;

enum TypeOfTask {
    SHOPPING, PAINTING, DRIVING
}

public class TaskFactory {

    private Repository repository;

    public TaskFactory() {
        repository = new Repository();
    }

    public Repository getRepository() {
        return repository;
    }

    public final Task createTask(final TypeOfTask typeOfTask) {

        switch (typeOfTask) {
            case SHOPPING: {
                ShoppingTask shoppingTask = new ShoppingTask("New Car", "Toyota or Mazda", 1);
                repository.addToRepository(shoppingTask, shoppingTask.isTaskExecuted());
                return shoppingTask;
            }
            case PAINTING: {
                PaintingTask paintingTask = new PaintingTask("Flat painting", "white", "kitchen");
                repository.addToRepository(paintingTask, paintingTask.isTaskExecuted());
                return paintingTask;
            }
            case DRIVING: {
                DrivingTask drivingTask = new DrivingTask("Going to shop", "Arkadia shoping mall", "by tram");
                repository.addToRepository(drivingTask, drivingTask.isTaskExecuted());
                return drivingTask;
            }
            default: {
                return null;
            }
        }
    }
}
