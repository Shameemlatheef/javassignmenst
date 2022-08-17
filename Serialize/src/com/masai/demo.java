package com.masai;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class demo {
public static void main(String[] args) throws Exception {
	FileInputStream fis=new FileInputStream("F://xyz.txt");
	ObjectInputStream ois=new ObjectInputStream(fis);
	Student  l=(Student)ois.readObject();
	System.out.println(l);
	ois.close();
	
	
		
		
	
}
}
