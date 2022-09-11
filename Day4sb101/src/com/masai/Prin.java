package com.masai;

import java.util.Scanner;

public class Prin {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int b=s.nextInt();
	try {
		int q=a/b;
		System.out.println(q);
	} catch (ArithmeticException e) {
		System.out.println("quotient is zero");
		throw e;
		
	}
	finally {
		System.out.println("End");
	}
	
}

}
