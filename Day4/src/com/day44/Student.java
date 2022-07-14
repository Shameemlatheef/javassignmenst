package com.day44;

public class Student {
    public int roll;
    public String name;
    public String address;
    public String collageName;
    public void show(){
        System.out.println(roll);
        System.out.println(name);
        System.out.println(address);
        System.out.println(collageName);
    }

    public Student() {
    }

    public Student(int roll, String name, String address) {
        this.roll = roll;
        this.name = name;
        this.address = address;
    }

    public Student(int roll, String name, String address, String collageName) {
        this.roll = roll;
        this.name = name;
        this.address = address;
        this.collageName = collageName;
    }

    public static Student getStudent(boolean isFromNIT){
        if(isFromNIT==true) {
            Student f1 = new Student(20, "shameem", "inchivila");
            f1.collageName="NIT";
            return f1;
        }
        else {
            Student f2=new Student(30,"micheal","kottyan","Riet");
            return f2;
        }
    }


}
