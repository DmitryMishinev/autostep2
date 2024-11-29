package ru.courses.office;
public class Employee {
    private String  name;
    private Department dept;

    public Employee(String name){
        this.name=name;
        this.dept=null;

    }

    public Employee(String name, Department dept){
        this.name=name;
        this.dept=dept;
    }
    public String getName() {
        return name;
    }

    public Department getDept() {
        return dept;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setDept(Department dept) {
        if (this.dept==null) {
            this.dept = dept;
        }
        else if (name==this.dept.getFio().name){
            throw new IllegalArgumentException(name + " начальник другого отдела");
        }
    }


    public String toString(){
        if (name==dept.getFio().name){
            return name + " начальник отдела " + dept.getName() ;
        }else {
            return name + " работает в отделе " + dept.getName() + " начальник которого " + dept.getFio().name;
        }

    }
}
