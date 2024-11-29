package ru.courses.birds;
public  abstract class Bird {
    String color;
    int age;
    public Bird(String color, int age) {
        this.color = color;
        this.age= age;
    }
    public abstract String song();
}
