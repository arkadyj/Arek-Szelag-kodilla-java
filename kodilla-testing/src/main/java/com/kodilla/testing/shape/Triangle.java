package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private double sideA;
    private double height;

    public Triangle(double sideA, double height) {
        this.sideA = sideA;
        this.height = height;
    }

    public double getSideA() {
        return sideA;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void getShapeName() {
        System.out.println("This is triangle");
    }

    @Override
    public double getField() {

        if (this.sideA>0 && this.height>0) {
            return 0.5*this.sideA*this.height;
        }
        else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.sideA, sideA) != 0) return false;
        return Double.compare(triangle.height, height) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
