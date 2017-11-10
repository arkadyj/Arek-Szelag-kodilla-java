package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {
    static private int testCounter=0;

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure(){
        //given
        ShapeCollector shapeCollector = new ShapeCollector();

        //when
        Shape circle = new Circle(2.5);
        shapeCollector.addFigure(circle);

        //Then
        Assert.assertEquals(1,shapeCollector.getShapeList().size());
    }

    @Test
    public void testRemoveFigure(){
        //given
        ShapeCollector shapeCollector = new ShapeCollector();

        //when
        Shape circle = new Circle(2.5);
        shapeCollector.addFigure(circle);
        shapeCollector.removeFigure(circle);

        //Then
        Assert.assertEquals(0,shapeCollector.getShapeList().size());
    }

    @Test
    public void testAddNull(){
        //given
        ShapeCollector shapeCollector = new ShapeCollector();

        //when

        ArrayList <Shape> tempList = new ArrayList<>(shapeCollector.getShapeList());
        boolean result = shapeCollector.addFigure(null);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(tempList,shapeCollector.getShapeList());
    }

    @Test
    public void testRemoveNull(){
        //given
        ShapeCollector shapeCollector = new ShapeCollector();

        //when
        ArrayList <Shape> tempList = new ArrayList<>(shapeCollector.getShapeList());
        boolean result = shapeCollector.removeFigure(null);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(tempList,shapeCollector.getShapeList());
    }

    @Test
    public void testGetFigure(){
        //given
        ShapeCollector shapeCollector = new ShapeCollector();

        //when
        Shape square = new Square(6);
        shapeCollector.addFigure(square);
        Shape retrivedShape = shapeCollector.getFigure(0);


        //Then
        Assert.assertEquals(square,retrivedShape);
    }

    @Test
    public void testGetFigureNotExists(){
        //given
        ShapeCollector shapeCollector = new ShapeCollector();

        //when

        boolean result = shapeCollector.getFigure(0);


        //Then
        Assert.assertTrue(result);
    }

    @Test
    public void testRemoveNotExists(){
        //given
        ShapeCollector shapeCollector = new ShapeCollector();

        //when
        ArrayList <Shape> tempList = new ArrayList<>(shapeCollector.getShapeList());
        //Shape triangle = new Triangle(4.5,2);
        boolean result = shapeCollector.removeFigure(new Triangle(4.5,2));

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(tempList,shapeCollector.getShapeList());
    }
}
