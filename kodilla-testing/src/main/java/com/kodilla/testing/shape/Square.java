package com.kodilla.testing.shape;

public class Square implements Shape {

    private double sideA;

    public Square(double sideA) {
        this.sideA = sideA;
    }

    public double getSideA() {
        return sideA;
    }

    @Override
    public String getShapeName() {
        return "Square";

    }

    @Override
    public double getField() {

        if (this.sideA > 0) {
            return Math.pow(this.sideA, 2);
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        return Double.compare(square.sideA, sideA) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(sideA);
        return (int) (temp ^ (temp >>> 32));
    }
}
