package Encapsulation;


import java.awt.*;

public class Square {
    //Point point;
    int x;
    int y;
    private int sideLength;

//    public Square(Point point, int sideLength){
//        this.point=point;
//        checkSide(sideLength);
//    }

    public Square(int x, int y, int sideLength) {
        this.x=x;
        this.y=y;
        checkSide(sideLength);
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
//    public String toString(){
//        return "Квадрат в точке " + this.point.toString() + " со стороной " + sideLength;
//    }
}
