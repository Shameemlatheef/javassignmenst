package com.day7;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter no of students");
        int no=s.nextInt();
        Student[] students=new Student[no];
        for(int i=0;i<no;i++){
            System.out.println("Enter roll");
            int roll=s.nextInt();
            System.out.println("neter name");
            String name=s.next();
            System.out.println("enter address");
            String Addres=s.next();
            System.out.println("enter marks");
            int marks=s.nextInt();
            students[i]=new Student(roll,name,Addres,marks);
            System.out.println("===================");
            System.out.println(students[i]);

        }

    }
}
