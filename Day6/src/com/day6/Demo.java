package com.day6;

public class Demo {

    public static void main(String[] args) {
     if(args.length==1){
       int a=Integer.parseInt(args[0]);
     double b=  a^a;
         System.out.println(b);
     } else if (args.length==2) {
         int c=Integer.parseInt(args[0]);
         int d=Integer.parseInt(args[1]);
         double f=Math.floor(d-c);
         System.out.println(f);
     } else if (args.length>=3) {
         System.out.println("Error");
     }
    }
}
