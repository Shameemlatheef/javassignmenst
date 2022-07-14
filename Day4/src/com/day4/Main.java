package com.day4;

public class Main  {




    public static void main(String[] args) {
int x=25;
int t=300;
if((x>18)&(x<60)&&(t>100)&(t<500)){
    Student obj2=new Student(20,"micheal",30,55);
    Student obj1=new Student();
    obj1.setAge(x);
    obj1.setName("shameem");
    obj1.setMarks(t);
    obj1.setRoll(32);
    obj1.show();
}
else {
    System.out.println("invalid credentials");
}
Main l=new Student();
  Main  k  =(Main) l;




//obj1.show();


    }
}
