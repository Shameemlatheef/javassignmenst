package com.day10;

public class Area extends Shape{
    @Override
    public  int rectangleArea(int length, int breadth){
        return length*breadth;
    }
    @Override
    public  int squareArea(int side){
        return 4*side;
    }
    @Override
    public   int circleArea(int radius){
        return radius*radius;
    }
}
