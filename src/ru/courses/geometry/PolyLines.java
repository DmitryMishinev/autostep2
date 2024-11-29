package ru.courses.geometry;
public class PolyLines {
    Point[] points;

    public PolyLines(Point... points){
        this.points=points;
    }
    public String toString(){
        String res="Линия {";
        for(int i=0;i< points.length;i++){
            res+=points[i].toString()+" ";
        }
        return res+"}";
    }
    public Line[] getLines(){
        for(int i=0;i< getLines().length;i++){

        }
        return getLines();
    }
}

