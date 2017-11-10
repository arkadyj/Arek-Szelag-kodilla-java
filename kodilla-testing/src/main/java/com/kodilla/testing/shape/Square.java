package com.kodilla.testing.shape;

public class Square implements Shape {

    private int sideA;

    public int getSideA() {
        return sideA;
    }

    @Override
    public void getShapeName() {
        System.out.println("This is Square");

    }

    @Override
    public double getField() {

        if (this.sideA>0){
            return Math.pow(this.sideA,2);
        }
        else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        return sideA == square.sideA;
    }

    @Override
    public int hashCode() {
        return sideA;
    }
}
