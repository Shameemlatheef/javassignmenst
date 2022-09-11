package com.masai;

import java.util.Scanner;

public class Number {

public static void main(String[] args) {
	try {
		Scanner s=new Scanner(System.in);
		String h=s.next();
		int d=Integer.parseInt(h);
		int a=d*d;
		System.out.println("square is"+a);
		
	}catch(Exception j) {
		System.out.println("Number mismatch");
	}
	finally{
		System.out.println("Work don succesfully");
	}
}
	
	
}
