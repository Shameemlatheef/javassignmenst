package com.Day5;

import java.util.Scanner;

public class Course {
int courseId;
String courseName;
int courseFee;
void DisplayCoursedetails(){
    System.out.println(courseId);
    System.out.println(courseFee);
    System.out.println(courseName);
}

static void Authenticate(String username,String pass){
    if((username=="Admin")&&(pass=="1234")){
        Course c1=new Course();
        c1.DisplayCoursedetails();
    }
    else{
        System.out.println("invalid credentials");
    }

}

    public static void main(String[] args) {
    Course b=new Course();
        Scanner s=new Scanner(System.in);
        System.out.println("enter name");
        String usernam=s.next();
        System.out.println("enter password");
        String pas=s.next();
        System.out.println("enter course id");
        int q=s.nextInt();
        b.courseId=q;
       // b.courseId=s.nextInt();
        System.out.println("enter course fee");
        int w=s.nextInt();
        b.courseFee=w;
        //b.courseFee=s.nextInt();
        System.out.println("enter course name");
        String e=s.next();
        b.courseName=e;
        //b.courseName=s.next();

        Course.Authenticate(usernam,pas);



    }
}
