package org.example;

public class Student {
    private String stu_num;
    private String name;

    public Student(String stu_num, String name) {
        this.stu_num = stu_num;
        this.name = name;
    }

    public Student() {

    }

    public String getStu_num() {
        return stu_num;
    }

    public void setStu_num(String stu_num) {
        this.stu_num = stu_num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student : " + stu_num + " - " + name;
    }
}
