package com.masai;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
	try{
	
		 Scanner s=new Scanner(System.in);
         System.out.println("Enter first number");
         int num1=s.nextInt();
         System.out.println("Enter second number");
         int num2=s.nextInt();
         String message =null;
         int num3=num1/num2;
         if(num3>10){
             message = "Welcome to Exception Handling ";
         }
         System.out.println("Message is :"+message.toUpperCase());
     }
     catch (NumberFormatException N){
         System.out.println(N.getMessage());
     }
     catch (NullPointerException a){
         System.out.println(a.getMessage()
         );
     }
      System.out.println("end of main");

	
	}
	}
	
	
