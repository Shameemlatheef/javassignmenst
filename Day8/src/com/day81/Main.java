package com.day81;

public class Main {
    public static void main(String[] args) {
        Animal[] animals=new Animal[3];
        animals[0]=new Dog();
        animals[1]=new Cat();
        animals[2]=new Tiger();
        animals[0].eat();
        animals[0].makeNoise();
        animals[0].walk();
        Dog d1=(Dog) animals[0]; //downcasting
        d1.eat();
        d1.makeNoise();
        d1.walk();
        animals[1].walk();
        animals[1].eat();
        animals[1].makeNoise();
        animals[2].eat();
        animals[2].walk();
        animals[2].makeNoise();
    }
}
