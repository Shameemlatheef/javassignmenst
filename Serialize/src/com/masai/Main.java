package com.masai;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main {
public static void main(String[] args) throws Exception {
	Student s=new Student();
	s.setName("Shameem");
	s.setRoll(12);
Address a=new Address();
a.setCity("tvm");
a.setPincode("777");
a.setState("Keral");
s.address=a;
	FileOutputStream fos=new FileOutputStream("F://xyz.txt");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(s);
	oos.close();
	System.out.println("done");
	
	
	
	
	
	
}
}
