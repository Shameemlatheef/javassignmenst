package com.day10;

public class Sciencstudent extends Student{
  int  phisicsMarks;
    int chemistryMarks;
   int mathsMarks;

    public Sciencstudent(String name, String address, int phisicsMarks, int chemistryMarks, int mathsMarks) {
        super(name, address);
        this.phisicsMarks = phisicsMarks;
        this.chemistryMarks = chemistryMarks;
        this.mathsMarks = mathsMarks;
    }

    @Override
      float getPercentage() {
        int total=phisicsMarks+chemistryMarks+mathsMarks;
       float to=(total*100)/200;
        return to;
    }

    @Override
    public String toString() {
        return "Sciencstudent{" +
                "phisicsMarks=" + phisicsMarks +
                ", chemistryMarks=" + chemistryMarks +
                ", mathsMarks=" + mathsMarks +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +"percentage"+getPercentage()+
                '}';
    }
}
