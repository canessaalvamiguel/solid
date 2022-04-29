package com.canessasoft;

public class Square implements Shape{

    private double length;

    public Square(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double area() {
        return Math.pow( this.length, 2 );
    }
}
