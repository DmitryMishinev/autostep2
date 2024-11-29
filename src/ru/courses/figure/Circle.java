package ru.courses.figure;

import ru.courses.figure.*;
import ru.courses.geometry.Point;

public class Circle extends Figure{
    public Circle(Point point, double x){
        super(point, x);
    }
    public double getArea(){
        return Math.PI * Math.pow(x, 2);
    }
}
