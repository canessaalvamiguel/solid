package com.canessasoft;

import java.util.List;

public class AreaCalculator {

    public double sum(List<Object> shapes){
        double sum = 0;
        for(int i = 0; i < shapes.size(); i++){
            Object shape = shapes.get(i);
            if(shape instanceof Square){
                sum += Math.pow( ((Square) shape).getLength(), 2 );
            }
            if(shape instanceof Circle){
                sum += Math.PI + Math.pow( ((Circle) shape).getRadius(), 2);
            }
            if(shape instanceof Rectangle){
                sum += ((Rectangle) shape).getLength() * ((Rectangle) shape).getWidth();
            }
        }
        return sum;
    }
}
