package com.masai;

public class Userregistration {
public void Register(String name,String country) throws InvalidCountry {
	if(country!="India") {
		InvalidCountry i=new InvalidCountry("Invalid country");
		throw i;
	}
	else {
		System.out.println("User registration done succesfully");
	}
}
public static void main(String[] args) {
	Userregistration u=new Userregistration();
	try {
		u.Register("sam","India");
	} catch (InvalidCountry e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
			
}
}
