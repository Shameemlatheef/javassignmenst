package com.Day9;

public class Stud extends Person{
int Studentid;
String courseEnrolled;

    public int getStudentid() {
        return Studentid;
    }

    public void setStudentid(int studentid) {
        Studentid = studentid;
    }

    public String getCourseEnrolled() {
        return courseEnrolled;
    }

    public void setCourseEnrolled(String courseEnrolled) {
        this.courseEnrolled = courseEnrolled;
    }

    public int getCoursefee() {
        return Coursefee;
    }

    public void setCoursefee(int coursefee) {
        Coursefee = coursefee;
    }

    public Stud() {
    }

    public Stud(int studentid, String courseEnrolled, int coursefee) {
        Studentid = studentid;
        this.courseEnrolled = courseEnrolled;
        Coursefee = coursefee;
    }

    int Coursefee;

    @Override
    public String toString() {
        return "Stud{" +
                "Studentid=" + Studentid +
                ", courseEnrolled='" + courseEnrolled + '\'' +
                ", Coursefee=" + Coursefee +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address=" + address +
                '}';
    }
}
