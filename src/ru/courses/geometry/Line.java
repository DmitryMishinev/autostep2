package ru.courses.geometry;
public class Line implements Measurable{
    Point startPoint;
    Point endPoint;

    public Line(Point startPoint, Point endPoint){
        this.startPoint=startPoint;
        this.endPoint=endPoint;
    }
    public Line(int x1, int y1, int  x2, int y2){
        startPoint = new Point (x1,y1);
        endPoint = new Point(x2,y2);
    }
    public String toString(){
        return "Линия от " + startPoint + " до " + endPoint;
    }
    public double getLength(){
        return Math.sqrt(Math.pow(endPoint.x - startPoint.x,2)+Math.pow(endPoint.y - startPoint.y, 2));
    }

}
