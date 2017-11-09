package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private int testCounter=0;

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testNonExistsShape (){


    }
}
