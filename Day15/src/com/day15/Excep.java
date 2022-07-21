package com.day15;

import java.util.Scanner;

public class Excep {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        try {
            System.out.println("Enter the num1");
            String num1=s.next();

            int um1=Integer.parseInt(num1);
            int um2=um1*um1;
            System.out.println(um2);
        }
//        catch (NumberFormatException n){
//            System.out.println(n.getMessage());
//        }
        catch (Exception a){
            System.out.println("ENtered input is not a valid number");
        }



    }
}
