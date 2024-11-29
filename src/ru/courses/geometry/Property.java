package ru.courses.geometry;
public class Property {
    String name;
    Object obj;

    public Property(String name, Object obj){
        this.name = name;
        this.obj = obj;
    }
    public String toString(){
        return "Property{" + "name=" + name + ", obj=" + obj +"}";
    }
}
