package com.masai;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MAIN {
public static void main(String[] args) throws IOException {
	FileWriter ff=new FileWriter("F://abc.txt");
		
	ff.write("hai");
	ff.write("ramesh");
	ff.flush();
	ff.close();
	File h=new File("F://abc.txt");
	FileReader g=new FileReader("F://abc.txt");
	long s=h.length();

	int k=g.read();
	char v=(char)k;
	System.out.println(v);
	int count=0;
	
//	
	
	
	
	
}
}
