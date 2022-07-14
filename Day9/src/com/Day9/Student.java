package com.Day9;

import java.util.Scanner;

public class Student {
    private int roll;
    private String name;
    private int marks;
    private char grade;

    public void displayDetails(){
        System.out.println("Roll "+roll);
        System.out.println("Name "+name);
        System.out.println("marks "+marks);
       //calculateGrade();
        System.out.println("grade "+calculateGrade());


    }

    private char calculateGrade() {
int mark=getMarks();
       if (mark >=500){
            grade='A';
           //return grade;
        }
       else if( (mark<500) && (mark>=400)){
            grade='B';
           //return  grade ;
        }
       else {
           grade='C';
          // return grade;
        }
return grade;

    }

    public Student() {
    }

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public char getGrade() {
        return grade;
    }

    public Student(int roll, String name, int marks, char grade) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
        this.grade = grade;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", grade=" + grade +
                '}';
    }
}
