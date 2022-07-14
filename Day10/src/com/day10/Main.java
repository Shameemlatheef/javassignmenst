package com.day10;

public class Main {
    public static void main(String[] args) {
        Area a=new Area();
       // a.rectangleArea(20,10);
        System.out.println("area of circle "+a.circleArea(4));
        System.out.println("area of square "+a.squareArea(5));
        System.out.println("area of rectangle "+a.rectangleArea(10,20));
    }
}
