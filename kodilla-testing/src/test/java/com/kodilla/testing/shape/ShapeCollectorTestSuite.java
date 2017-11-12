package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ShapeCollectorTestSuite {
    static private int testCounter = 0;
    private ShapeCollector shapeCollector;

    //// Przeniosłem shapeCollector z metody do klasy
    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
        shapeCollector = new ShapeCollector();
    }

    @Test
    public void testAddFigure() {
        //given
        Shape circle = new Circle(2.5);

        //when
        shapeCollector.addFigure(circle);

        //Then
        Assert.assertEquals(1, shapeCollector.getFiguresNumber());
    }

    @Test
    public void testRemoveFigure() {
        //given
        Shape circle = new Circle(2.5);

        //when
        shapeCollector.addFigure(circle);
        shapeCollector.removeFigure(circle);

        //Then
        Assert.assertEquals(0, shapeCollector.getFiguresNumber());
    }

    @Test
    public void testAddNull() {
        //given


        //when
        shapeCollector.addFigure(null);

        //Then
        Assert.assertEquals(0, shapeCollector.getFiguresNumber());

    }

    @Test
    public void testRemoveNull() {
        //given
        shapeCollector.addFigure(new Circle(3));

        //when
        shapeCollector.removeFigure(null);

        //Then
        Assert.assertEquals(1, shapeCollector.getFiguresNumber());

    }

    @Test
    public void testGetFigure() {
        //given
        ShapeCollector shapeCollector = new ShapeCollector();

        //when
        Shape square = new Square(6);
        shapeCollector.addFigure(square);
        Shape retrivedShape = shapeCollector.getFigure(0);


        //Then
        Assert.assertEquals(square, retrivedShape);
    }

    @Test
    public void testGetFigureNotExists() {
        //given

        //when
        // napisałem Ci wcześniej że jak nie posiada takeigo obiektu to pownienien zwrócić nulla
        //nie rozumiem co ty chcesz osiągnąć
        Shape retrivedShape = shapeCollector.getFigure(0);

        //Then
        Assert.assertNull(retrivedShape);
    }

    @Test
    public void testRemoveNotExists() {
        //given


        //when
        boolean result = shapeCollector.removeFigure(new Triangle(4.5, 2));

        //Then
        Assert.assertFalse(result);

    }

    @Test
    public void testShowAllFigures() throws Exception {

        //given
        shapeCollector.addFigure(new Square(4));
        shapeCollector.addFigure(new Circle(7.2));
        String figuresName = "SquareCircle";

        //when
        String figuresToString = shapeCollector.showFigures();

        //Then
        Assert.assertEquals(figuresName, figuresToString);

    }

    @Test
    public void testGetFigureOutOfRange() throws Exception {

        //given


        //when
        Shape retrivedShape = shapeCollector.getFigure(15);

        //Then
        Assert.assertNull(retrivedShape);
    }
}
