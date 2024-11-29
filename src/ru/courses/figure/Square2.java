package ru.courses.figure;

import ru.courses.geometry.Point;

public class Square2  extends Figure{
    public Square2(Point point, double x){
        super(point,x);
    }
    @Override
    public double getArea() {
        return Math.pow(x,2);
    }
}
