package com.masai;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable{
public String name;
public String dob;
public String des;
public double  salry;
public String department;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getDes() {
	return des;
}
public void setDes(String des) {
	this.des = des;
}
public double getSalry() {
	return salry;
}
public void setSalry(double salry) {
	this.salry = salry;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public static void main(String[] args) {
	Employee e=new Employee();
	e.setDepartment("mech");
	e.setDes("hod");
	e.setDob("30/10/1995");
     e.setName("shameem");
     e.setSalry(300);
     try {
		FileOutputStream ff=new FileOutputStream("output.txt");
		try {
			ObjectOutputStream oo=new ObjectOutputStream(ff);
			oo.writeObject(e);
			oo.flush();
			oo.close();
			System.out.println("done");
			FileInputStream gg=new FileInputStream("output.txt");
			ObjectInputStream jj=new ObjectInputStream(gg);
			try {
				Employee u=(Employee)jj.readObject();
				
				System.out.println(u.getName());
				System.out.println(u.getSalry());
				System.out.println(u.getDepartment());
				System.out.println(u.getDes());
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
     
     }

}
