package com.day4;

public class Demo {

    void Demo(){
        System.out.println("hello");
    }
void Demo(String s){
        System.out.println("hello string");
    }
 void Demo(int i){
        System.out.println("hello int");
    }
    void Demo(float f){
        System.out.println("hello float");
    }

    public static void main(String[] args) {
        Demo d=new Demo();
        d.Demo();
        d.Demo("shameem");
        d.Demo(30);
        d.Demo(55.4f);
    }
}
