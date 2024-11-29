package ru.courses.figure;

import ru.courses.geometry.Point;

public class Rectangle extends Figure{
    double y;
    public Rectangle(Point point, double x, double y){
        super(point, x);
        this.y = y;
    }
    public double getArea(){
        return x*y;
    }
}
