package com.day44;

public class Main {
   void print(int x){
       if(x%2==1){
           System.out.println("odd");
       }
       else {
           System.out.println("Even");
       }
   }

    public static void main(String[] args) {
Main j= new Main();
Student s=new Student();
Student.getStudent(true).show();
Student.getStudent(false).show();

Main m=new Main();
m.print(5);



    }
}
