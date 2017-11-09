package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> shapeCollector = new ArrayList<Shape>();
    private Shape shape;

    public ShapeCollector(Shape shape){
        this.shape=shape;
    }

    public boolean addFigure (Shape shape) {

        return true;

    }

    public boolean removeFigure(Shape shape) {

        return true;

    }

    public Shape getFigure(int n) {

        return shape;

    }

    public void showFigures() {

    }
}
