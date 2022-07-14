package com.day10;

import java.util.Scanner;

public class Allclass {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("enetr name");
        String name=s.next();
        String add=s.next();
        History h=new History(name,add,40,50);
        System.out.println(h);
        Sciencstudent f=new Sciencstudent(name,add,40,60,70);
        System.out.println(f);
    }
}
