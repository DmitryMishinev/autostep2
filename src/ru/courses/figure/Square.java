package ru.courses.figure;

import ru.courses.geometry.Point;

public class Square extends Figure {
    Point point;
    private int sideLength;

    public double getArea() {
        return Math.pow(sideLength,2);
    }

    public Square(Point point, int sideLength){
        super(point,sideLength);
    }

    public Square(int x, int y, int sideLength) {
        super(new Point(x,y),sideLength);
    }

    public void checkSide (int sideLength){
        if (sideLength < 1) {
            throw new IllegalArgumentException("Квадрат не может быть с отрицательной стороной");
        }
        this.sideLength=sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        checkSide(sideLength);
    }
    public String toString(){
        return "Квадрат в точке " + this.point.toString() + " со стороной " + sideLength;
    }

}

