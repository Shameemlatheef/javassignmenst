package com.Day9;

public class Instructor extends Person{
    int instructorid;
    int salary;

    @Override
    public String toString() {
        return "Instructor{" +
                "instructorid=" + instructorid +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address=" + address +
                '}';
    }
}
