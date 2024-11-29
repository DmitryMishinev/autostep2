package ru.courses.geometry;
public class StringLength implements Measurable {
    String str;

    public StringLength(String str) {
        this.str = str;
    }

    public double getLength() {
        return str.length();
    }
}
