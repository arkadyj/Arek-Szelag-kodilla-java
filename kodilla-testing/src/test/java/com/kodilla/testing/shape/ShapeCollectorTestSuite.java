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
        Assert.assertEquals(1,shapeCollector.getFiguresNumber());
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
        Assert.assertEquals(0,shapeCollector.getFiguresNumber());
    }

    @Test
    public void testAddNull(){
        //given
        ShapeCollector shapeCollector = new ShapeCollector();

        //when
        boolean result = shapeCollector.addFigure(null);

        //Then
        Assert.assertEquals(0,shapeCollector.getFiguresNumber());

    }

    @Test
    public void testRemoveNull(){
        //given
        ShapeCollector shapeCollector = new ShapeCollector();

        //when
       boolean result = shapeCollector.removeFigure(null);

        //Then

        //// zrobiłem taki sam test jak powyżej, próba usunięcia nulla nie powinna zmieniać zawartości listy
        Assert.assertEquals(0,shapeCollector.getFiguresNumber());

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

        ////zmieniłem test - jeżeli chcemy zwrócić figurę, które nie istnieje metoda powinna zwrócić sam obiekt shape
        //// nie jestem pewien czy taka inicjalizacja jak poniżej zadziała.
        Shape shape = new Circle();
        Shape retrivedShape = shapeCollector.getFigure(0);


        //Then
        Assert.assertEquals(shape,retrivedShape );
    }

    @Test
    public void testRemoveNotExists(){
        //given
        ShapeCollector shapeCollector = new ShapeCollector();


        ////po usunięciu metody getShapeList musiałem również zmodyfikować ten test
        //// po próbie usunięcia figury, której nie ma, metoda zwróci false.
        //when
        boolean result = shapeCollector.removeFigure(new Triangle(4.5,2));

        //Then
        Assert.assertFalse(result);

    }

    @Test
    public void testShowAllFigures() throws Exception {
        //// test wyświetlający wszystkie figury  jest poprawny, gdy wyświetli wszystkie figury.
        ////Dlatego zmienię implementację showFigures(), tak aby zwracała ilość wyświetlonych figur i następnie porównam ją z ilością figur w liście.

        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Square(4));
        shapeCollector.addFigure(new Circle(7.2));

        //when
        int numberPrintedFigures = shapeCollector.showFigures();

        //Then
        Assert.assertEquals(shapeCollector.getFiguresNumber(),numberPrintedFigures);


    }

    @Test
    public void testGetFigureOutOfRange() throws Exception {
       //// próba zwrotu figury, której nie ma będzie wyglądała podobnie jak próba zwrotu figury której nie ma. Chyba, że źle to rozumiem. Każda próba zwrotu
        //// figury, której nie ma powinna zwrócić pusty obiekt typu shape.

        //given
        ShapeCollector shapeCollector = new ShapeCollector();

        //when
        Shape shape = new Circle();
        Shape retrivedShape = shapeCollector.getFigure(15);

        //Then
        Assert.assertEquals(shape,retrivedShape );
    }
}
