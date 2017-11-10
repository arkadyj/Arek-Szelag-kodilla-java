package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> shapeList = new ArrayList<>();
    private Shape shape;

    public ShapeCollector(Shape shape){
        this.shape=shape;
    }

    public ArrayList<Shape> getShapeList() {
        return shapeList;
    }


    /*
    public int getListSize(){
        return shapeList.size();
    } */

    public ShapeCollector()
    {

    }

    public void addFigure (Shape shape) {



    }

    public void removeFigure(Shape shape) {



    }

    public Shape getFigure(int n) {

        return shape;

    }

    public void showFigures() {

    }
}
