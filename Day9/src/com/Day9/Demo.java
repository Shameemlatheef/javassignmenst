package com.Day9;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Student s1=new Student();
        Scanner s=new Scanner(System.in);
        System.out.println("enter roll number");
        int roll=s.nextInt();
        System.out.println("enter name");
        String name=s.next();
        System.out.println("enter marks");
        int marks=s.nextInt();
        s1.setRoll(roll);
        s1.setName(name);
        s1.setMarks(marks);
        s1.displayDetails();
        System.out.println(s1);
    }
}
