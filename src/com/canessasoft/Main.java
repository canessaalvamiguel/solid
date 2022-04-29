package com.canessasoft;

import java.util.List;

public class Main {
    public static void main(String[] args){
        AreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(10);
        Square square = new Square(10);
        Rectangle rectangle = new Rectangle(10, 10);
        List<Object> shapes = List.of(circle, square, rectangle);
        ShapePrinter printer = new ShapePrinter();
        double sum = areaCalculator.sum(shapes);
        System.out.println(printer.json(sum));
    }
}
