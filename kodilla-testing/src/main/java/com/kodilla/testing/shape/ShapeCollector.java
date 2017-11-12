package com.kodilla.testing.shape;

import sun.security.provider.SHA;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> shapeList = new ArrayList<>();
    private Shape shape;

    public ShapeCollector(Shape shape) {
        this.shape = shape;
    }

    public int getFiguresNumber() {
        return shapeList.size();
    }

    public ShapeCollector() {

    }

    public boolean addFigure(Shape shape) {

        if (shape != null) {
            shapeList.add(shape);
            return true;
        }
        return false;
    }

    public boolean removeFigure(Shape shape) {
        if (shapeList.contains(shape)) {
            shapeList.remove(shape);
            return true;
        }
        return false;
    }

    public Shape getFigure(int n) {
        Shape shape = null;

        if (shapeList.size() >= n && shapeList.size() > 0) {
            return shapeList.get(n);
        }

        return shape;

    }

    public String showFigures() {
        String result = "";
        for (Shape shape : shapeList) {
            result += shape.getShapeName();
        }

        return result;
    }
}
