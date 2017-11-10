package com.kodilla.testing.shape;

public class Circle implements Shape {

    private double r;

    public double getR() {
        return r;
    }

    public Circle( double r) {
        this.r=r;
    }

    public Circle(){

    }

    @Override
    public void getShapeName() {
        System.out.println("This is Circle");
    }

    @Override
    public double getField() {

        if (this.r>0) {
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

        return Double.compare(circle.r, r) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(r);
        return (int) (temp ^ (temp >>> 32));
    }
}
