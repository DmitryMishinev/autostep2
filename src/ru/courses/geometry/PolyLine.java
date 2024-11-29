package ru.courses.geometry;
class PolyLine implements Measurable{
    Point[] points;
    Line[] lines;

    public PolyLine(){

    }
    public PolyLine(Point[] points){
        this.points = points;
        lines = new Line[points.length-1];
        for(int i=0; i<points.length-1;i++){
            lines[i]=new Line(points[i], points[i+1]);
        }
    }
    public String returnStringBrokenLine(){
        String res="Линия: [";
        for(int i=0; i< points.length; i++){
            res+=points[i].toString() + ",";
        }
        res=res.substring(0,res.length()-1);
        return res+"]";
    }
    public void printLines(){
        for(int i = 0; i<lines.length;i++){
            System.out.print(lines[i].toString() + " ");
        }
        System.out.println("");
    }
    public Line[] getMassLine(){
        return lines;
    }
    public double getLength(){
        double length=0;
        for (int i = 0; i < lines.length; i++){
            length+=lines[i].getLength();
        }
        return Math.round(length*100.00)/100.00;
    }
}

