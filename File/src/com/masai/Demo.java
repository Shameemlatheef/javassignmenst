package com.masai;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Demo {
public static void main(String[] args) {
	try {
		FileWriter fw =new FileWriter("abcd.txt");
		PrintWriter pp=new PrintWriter(fw);
		pp.write("shameem");
	     pp.write("\n");
	
		pp.write(12);
		 pp.write("\n");
		char[] c= {'c','c','d'};
		pp.write(c);
		pp.flush();
		pp.close();
		FileWriter bb=new  FileWriter("dd.txt");
		BufferedReader dd=new BufferedReader(new FileReader("abcd.txt"));
		String s=dd.readLine();
		bb.write(s);
		bb.flush();
		bb.close();
	    
	
		System.out.println("done");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
		try {
			FileReader fr=new FileReader("abcd.txt");
			BufferedReader br=new BufferedReader(fr);
			try {
				String s=br.readLine();
				System.out.println(s);
				System.out.println(br.read());
				//char[] v=new char[5];
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileInputStream fi=new FileInputStream("Sss.PNG");
			FileOutputStream fos=new FileOutputStream("SCRE.JPG");
			try {
				int i=fi.read();
				while(i!=-1) {
					fos.write(i);
					fos.flush();
					fos.close();
					System.out.println("done");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	
		
	
	
			
}
}
