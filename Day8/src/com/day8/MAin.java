package com.day8;

public class MAin {
    public static void main(String[] args) {
//        Bird b=new Bird();
//        b.fly();
//        b.kill();
        Bird b1=new Parrot();
        b1.kill();
        b1.fly();
      Parrot c=(Parrot) b1;
      c.sing();
      c.fly();
      c.kill();

    }
}
