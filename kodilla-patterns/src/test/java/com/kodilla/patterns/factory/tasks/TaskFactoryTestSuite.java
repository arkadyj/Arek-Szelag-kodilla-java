package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TaskFactoryTestSuite {

    TaskFactory factory;

    @Before
    public void beforeEveryTest() {
        factory = new TaskFactory();
    }

    @Test
    public void testShoppingTask() {
        //Given

        //When
        Task shopingTask = factory.createTask(TypeOfTask.SHOPPING);
        shopingTask.executeTask();
        String nameOfTask = shopingTask.getTaskName();

        //Then
        Assert.assertEquals("New Car", nameOfTask);
        Assert.assertTrue(factory.getRepository().getTaskMap().get(shopingTask));
        Assert.assertEquals(1, factory.getRepository().getTaskMap().size());
    }

    @Test
    public void testPaintingTask() {
        //Given

        //When
        Task paintingTask = factory.createTask(TypeOfTask.PAINTING);
        paintingTask.executeTask();
        String nameOfTask = paintingTask.getTaskName();

        //Then
        Assert.assertEquals("Flat painting", nameOfTask);
        Assert.assertTrue(factory.getRepository().getTaskMap().get(paintingTask));
        Assert.assertEquals(1, factory.getRepository().getTaskMap().size());
    }

    @Test
    public void testDrivingTask() {
        //Given

        //When
        Task drivingTask = factory.createTask(TypeOfTask.DRIVING);
        drivingTask.executeTask();
        String nameOfTask = drivingTask.getTaskName();

        //Then
        Assert.assertEquals("Going to shop", nameOfTask);
        Assert.assertTrue(factory.getRepository().getTaskMap().get(drivingTask));
        Assert.assertEquals(1, factory.getRepository().getTaskMap().size());
    }
}
