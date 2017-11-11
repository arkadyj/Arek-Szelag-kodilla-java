package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ShapeCollectorTestSuite {
    static private int testCounter = 0;
    //ShapeCollector powinien być na poziomie klasy a nie metody, tak jak pokazałem Ci w porzednim ćwiczeniu.
    //duplikacja kodu jest bezsensu
    //Usuwaj prosze duplikacje nowej liniii(entery).
    //Automatyczne formatowanie kodu w Intellij, ctrl-alt-l
    //uzywaj przed commitem
    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //given
        ShapeCollector shapeCollector = new ShapeCollector();

        //when
        Shape circle = new Circle(2.5);
        shapeCollector.addFigure(circle);

        //Then
        Assert.assertEquals(1, shapeCollector.getFiguresNumber());
    }

    @Test
    public void testRemoveFigure() {
        //given
        ShapeCollector shapeCollector = new ShapeCollector();

        //when
        Shape circle = new Circle(2.5);
        shapeCollector.addFigure(circle);
        shapeCollector.removeFigure(circle);

        //Then
        Assert.assertEquals(0, shapeCollector.getFiguresNumber());
    }

    @Test
    public void testAddNull() {
        //given
        ShapeCollector shapeCollector = new ShapeCollector();

        //when
        boolean result = shapeCollector.addFigure(null);//po co ten result? jak coś jest bez sensu to tego nie używaj

        //Then
        Assert.assertEquals(0, shapeCollector.getFiguresNumber());

    }

    @Test
    public void testRemoveNull() {
        //given
        ShapeCollector shapeCollector = new ShapeCollector();

        //when
        boolean result = shapeCollector.removeFigure(null);//po co ten result?

        //Then

        //// zrobiłem taki sam test jak powyżej, próba usunięcia nulla nie powinna zmieniać zawartości listy
        Assert.assertEquals(0, shapeCollector.getFiguresNumber());

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
        ShapeCollector shapeCollector = new ShapeCollector();

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
        ShapeCollector shapeCollector = new ShapeCollector();


        ////po usunięciu metody getShapeList musiałem również zmodyfikować ten test
        //// po próbie usunięcia figury, której nie ma, metoda zwróci false.
        //when
        boolean result = shapeCollector.removeFigure(new Triangle(4.5, 2));

        //Then
        Assert.assertFalse(result);

    }

    @Test
    public void testShowAllFigures() throws Exception {
       // showFigures moze niech wypisze nazwy figur i ich pola do String? bo widze ze teraz ta metoda robi to samo co getFiguresNumber


        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Square(4));
        shapeCollector.addFigure(new Circle(7.2));

        //when
        int numberPrintedFigures = shapeCollector.showFigures();

        //Then
        Assert.assertEquals(2, numberPrintedFigures);

    }

    @Test
    public void testGetFigureOutOfRange() throws Exception {
        //generalnie standardem jest że powinno zwrócić nulla,

        //given
        ShapeCollector shapeCollector = new ShapeCollector();

        //when

        Shape retrivedShape = shapeCollector.getFigure(15);

        //Then
        Assert.assertNull(retrivedShape);
    }
}
