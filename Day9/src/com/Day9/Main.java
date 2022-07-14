package com.Day9;

import java.util.Scanner;

public class Main {
    public static Person generatePerson(Person person){
     Person p=new Stud(2,"JA111",400000);

//     p.address.setCity("tvm");
//     p.address.setPincode("695502");
//     p.address.setState("kerala");


//     p.name="shameem";
//     p.address.city="trivandrum";
//     p.address.pincode="695502";
//     p.address.state="kerala";
//     Stud s1=(Stud)p;
//     s1.setStudentid(20);
//     s1.setCourseEnrolled("JA111");
//     s1.setCoursefee(400000);
          return p;


    }

    public static void main(String[] args) {

        Person newStudent = generatePerson(new Stud());

        //Person newTeacher = generatePerson(new Instructor());
        System.out.println(newStudent);
        //System.out.println(newTeacher);
    }
}
