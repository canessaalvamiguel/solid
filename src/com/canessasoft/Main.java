package com.canessasoft;

import java.util.List;

public class Main {
    public static void main(String[] args){
        IAreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(10);
        Square square = new Square(10);
        Rectangle rectangle = new Rectangle(10, 10);
        Cube cube = new Cube(10);
        List<Shape> shapes = List.of(circle, square, rectangle, cube);
        ShapePrinter printer = new ShapePrinter(areaCalculator);
        System.out.println(printer.json(shapes));
    }
}
