package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] tab = new int[]{1, 4, 2, 3};


        //When
        Double result = ArrayOperations.getAverage(tab);

        //Then
        Assert.assertEquals (2.5, result, 0.0);
        Assert.assertEquals(4, tab.length);

    }

    @Test
    public void testEmptyArrayGetAverage() {
        //Given
        int[] tab = new int[]{};


        //When
        Double result = ArrayOperations.getAverage(tab);

        //Then
        Assert.assertEquals(0, result, 0.0);
        Assert.assertEquals(0, tab.length);

    }
}
