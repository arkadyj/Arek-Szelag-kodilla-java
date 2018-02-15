package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class KodillaStudentTaskTestSuite {

    @Test
    public void testKodillaTask() {
        //Given
        KodillaStudent rkowczew = new KodillaStudent("Ray Kowaczew");
        KodillaStudent knash = new KodillaStudent("Kendra Nash");
        KodillaStudent dprat = new KodillaStudent("Douglas Pratt");
        KodillaStudent lwoods = new KodillaStudent("Luke Woods");
        KodillaStudent jwright = new KodillaStudent("Justin Wright");
        KodillaMentor jburton = new KodillaMentor("Jo Burton");
        KodillaMentor smoore = new KodillaMentor("Sherri Moore");

        rkowczew.getQueue().registerObserver(jburton);
        knash.getQueue().registerObserver(smoore);
        dprat.getQueue().registerObserver(smoore);
        lwoods.getQueue().registerObserver(jburton);
        jwright.getQueue().registerObserver(jburton);

        //When
        rkowczew.getQueue().addTask("Task 5.3 gradle installation");
        knash.getQueue().addTask("Task 3.1 Set and HashSet");
        dprat.getQueue().addTask("Task 3.4 While loop examples");
        lwoods.getQueue().addTask("Task 3.2 Queue and ArrayDeque");
        jwright.getQueue().addTask("Task 7.4 Stream flatMap() and reduce()");
        rkowczew.getQueue().addTask("Task 6.3 Junit first test");

        //Then
        Assert.assertEquals(2, rkowczew.getQueue().getTaskQueue().size());
        Assert.assertEquals(1, lwoods.getQueue().getTaskQueue().size());
        Assert.assertEquals("Task 3.2 Queue and ArrayDeque", lwoods.getQueue().getTaskQueue().getLast());
        Assert.assertEquals("Task 6.3 Junit first test", rkowczew.getQueue().getTaskQueue().getLast());
    }
}
