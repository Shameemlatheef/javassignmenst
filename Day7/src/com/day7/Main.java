package com.day7;

public class Main {
    public static void main(String[] args) {
      Employee m1=new Employee();
      m1.Name="shameem";
      m1.Address="parassala";
      m1.Age=27;
      m1.Salary=5000;
      m1.Phonenumber="8129295510";
      m1.Specialisation="mechanical";
      m1.Department="me";
      m1.printsalary();
      m1.display();
     Manager m2=new Manager();

      m2.Name="michel";
      m2.Age=26;
      m2.Address="kottyam";
      m2.Salary=40000;
      m2.Phonenumber="7907304335";
      m2.Department="mech";
      m2.Specialisation="pusher";
      m2.printsalary();
      m2.display();


    }
}
