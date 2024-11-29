package ru.courses.birds;
public class Cuckoo extends Bird{
    public Cuckoo(String color, int age){
        super(color, age);
    }

    public String song(){
        String res = "куку";
        for(int i=0;i<(Math.random()*10)+1;i++){
            res+="ку-ку";
        }
        return "ку-ку";
    }
}
