package ru.courses.student;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Integer> grades;
    private Rule rule;

    public Student(String name){
        this.name=name;
        grades = new ArrayList<>();
    }
    public Student(String name,Rule rule){
        this.name=name;
        this.rule=rule;
        grades = new ArrayList<>();
    }
    public  void addGrade(int grade){
        if(rule.check(grade)){
            grades.add(grade);
        } else {
            System.out.println("Не соответствует правилу");;
        }
    }
    public String toString(){
        return name + ": " + grades;
    }

    public void addGrade(int... grade){
        for(int i=0; i<grade.length; i++){
            if(2<=grade[i] && grade[i]<=5){
                grades.add(grade[i]);
            } else {
                System.out.println("Оценка " + grade[i] +" не добавлена: диапазон от 2 до 5");
            }
        }
    }
    public List<Integer> getGrades(){
        ArrayList<Integer> copyGrades = new ArrayList<Integer>(grades);
        /*ArrayList<Integer> copyGrades= new ArrayList<>();
        copyGrades.addAll(grades);*/
        return copyGrades;
    }}
