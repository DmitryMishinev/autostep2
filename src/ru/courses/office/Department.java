package ru.courses.office;
public class Department {
    private String name;

    private Employee fio;

    public Department(String name){
        this.name=name;
        this.fio=null;
    }
    public Department(String name, Employee fio){
        this.fio=fio;
        this.name=name;
        fio.setDept(this);
    }

    public String getName() {
        return name;
    }

    public Employee getFio() {
        return fio;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setFio(Employee fio) {
        this.fio = fio;
    }
}
