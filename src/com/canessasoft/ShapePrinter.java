package com.canessasoft;

import java.util.List;

public class ShapePrinter {

    private final IAreaCalculator areaCalculator;

    public ShapePrinter(IAreaCalculator areaCalculator) {
        this.areaCalculator = areaCalculator;
    }

    public String json(List<Shape> shapes){
        return "{sum: "+areaCalculator.sum(shapes)+"}";
    }
}
