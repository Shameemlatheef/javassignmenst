package com.Day9;

import java.util.Scanner;

public final class Child extends Parent{


    @Override
    public void method1(){
        System.out.println("method in child"+number);
    }
    public void method4(){
        System.out.println("method 4 in child ");
    }

    public static void main(String[] args) {
        Parent p=new Child();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the  number");
        p.number=s.nextInt();
        if(p.number<=10&& p.number>0){
            p.method1();
            p.method2();
            p.method3();
            Child c=(Child) p;
            c.method4();
        }
        else {
            System.out.println("invalid");
        }


    }
}
