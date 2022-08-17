package com.masai;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.stream.Stream;

public class Vain {
public static void main(String[] args) {
	try {
		Scanner s=new Scanner(System.in);
		String j=s.next();
		
		FileWriter fw=new FileWriter(j);
		PrintWriter p=new PrintWriter(fw);
		p.write("shameem");
		p.flush();
		p.close();
		String o=s.next();
		FileReader k=new FileReader(j);
		BufferedReader bw=new BufferedReader(k);
		String f=bw.readLine();
		String h=f.toUpperCase();
		p.write(h);
		p.flush();
		p.close();
		System.out.println("done");
		
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
