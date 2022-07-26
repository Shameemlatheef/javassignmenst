package com.masai;

public class Demo1 {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try {
            int c=a/b;
            System.out.println(c);
        }
        catch (ArithmeticException ae){
            System.out.println("Divide by zero exception caught");
        }
        finally {
            System.out.println("Inside finally block");
        }
    }
}
