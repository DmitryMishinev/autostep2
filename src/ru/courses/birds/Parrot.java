package ru.courses.birds;
public class Parrot extends Bird{
    String text;
    public Parrot(String color, int age, String text) {
        super(color, age);
        this.text = text;
    }

    public String song() {
        return text.substring(0, (int) (Math.random() * text.length())+1);
    }
}
