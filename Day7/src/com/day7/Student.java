package com.day7;

public class Student {
    Integer   roll;
    String name;
    String  address;
    Integer marks;

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", marks=" + marks +
                '}';
    }

    public Student() {
    }

    public Integer getRoll() {
        return roll;
    }

    public void setRoll(Integer roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    public Student(Integer roll, String name, String address, Integer marks) {
        this.roll = roll;
        this.name = name;
        this.address = address;
        this.marks = marks;
    }
}
