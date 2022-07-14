package com.day4;

public class Student extends Main{
   private int roll;



    private String name;

    public Student() {
    }

    private int age;
    private int marks;

public void show(){
    System.out.println(roll);
    System.out.println(name);
    if (age>18){
        System.out.println(age);
    }
    else {
        System.out.println("invalid age");
    }
    if (marks<500 & marks>0){
        System.out.println(marks);
    }
    else {
        System.out.println("enter marks ");
    }
    System.out.println(marks);
}

    public Student(int roll, String name, int age, int marks) {
        this.roll = roll;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
