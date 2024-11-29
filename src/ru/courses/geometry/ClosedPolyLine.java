package ru.courses.geometry;
public class ClosedPolyLine extends PolyLine{
    public ClosedPolyLine(Point[] points) {
        super(points);
    }

    public double getLengthBroken() {
        return Math.round(super.getLength() + new Line(points[0],points[points.length-1]).getLength()*100.00/100.00);
    }
}
