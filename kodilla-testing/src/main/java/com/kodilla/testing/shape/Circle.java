package com.kodilla.testing.shape;

public class Circle implements Shape {

    private int r;

    public int getR() {
        return r;
    }

    @Override
    public void getShapeName() {
        System.out.println("This is Circle");
    }

    @Override
    public double getField() {

        if (this.r!=null && this.r>0) {
            return 2*3.14*this.r;
        }
        else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        return r == circle.r;
    }

    @Override
    public int hashCode() {
        return r;
    }
}
