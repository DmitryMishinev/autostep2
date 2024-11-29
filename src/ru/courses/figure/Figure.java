package ru.courses.figure;

import ru.courses.geometry.Point;

public abstract class Figure {
    Point point;
    double x;
    public Figure(Point point, double x) {
        this.point = point;
        this.x = x;
    }
    public abstract double getArea();
}
