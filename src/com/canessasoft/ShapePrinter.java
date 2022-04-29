package com.canessasoft;

import java.util.List;

public class ShapePrinter {

    private AreaCalculator areaCalculator = new AreaCalculator();

    public ShapePrinter(AreaCalculator areaCalculator) {
        this.areaCalculator = areaCalculator;
    }

    public String json(List<Shape> shapes){
        return "{sum: "+areaCalculator.sum(shapes)+"}";
    }
}
