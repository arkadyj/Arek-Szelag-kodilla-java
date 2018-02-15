package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

public class KodillaStudentTaskTestSuite {

    @Test
    public void testKodillaTask() {
        KodillaStudent areks = new KodillaStudent("Arek Szeląg");
        KodillaMentor klikus = new KodillaMentor("Karol Likus");

        areks.registerObserver(klikus);
        areks.addTask("Zad 20.1");
        /*
        areks.getTaskQueue().registerObserver(klikus);

        areks.getTaskQueue().addTask("Zad 20.1");
        areks.getTaskQueue().addTask("Zad 20.2"); */


    }
}
