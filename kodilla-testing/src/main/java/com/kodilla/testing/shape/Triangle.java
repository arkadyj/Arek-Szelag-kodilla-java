package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private int sideA;
    private int height;


    public int getSideA() {
        return sideA;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void getShapeName() {
        System.out.println("This is triangle");
    }

    @Override
    public void getField() {

        if (this.sideA!=null && this.sideA>0 && this.height!=null && this.height>0) {
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

        if (sideA != triangle.sideA) return false;
        return height == triangle.height;
    }

    @Override
    public int hashCode() {
        int result = sideA;
        result = 31 * result + height;
        return result;
    }
}
