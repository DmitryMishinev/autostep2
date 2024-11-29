package ru.courses.birds;
public class Sparrow extends Bird{
    public Sparrow(String color, int age) {
        super(color, age);
    }

    public String song() {
        return "чирик";
    }
}
