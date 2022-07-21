package com.masai;

import java.util.Scanner;

public class Main1 {
    public static Employee getEmployeeDetails(){
        Scanner s=new Scanner(System.in);
        System.out.println("enter id");
        int id=s.nextInt();
        System.out.println("enter name");
        String name=s.next();
        System.out.println("Enter salary");
        double salary=s.nextInt();
        System.out.println("Enter pf oercentage");
        int pf=s.nextInt();
        Employee e1=new Employee();
        e1.setEmployeeId(id);
        e1.setEmployeeName(name);
        e1.setSalary(salary);
        e1.calculateNetSalary(pf);

        return e1;



    }

    public static void main(String[] args) {
        System.out.println(getEmployeeDetails());
    }
}
