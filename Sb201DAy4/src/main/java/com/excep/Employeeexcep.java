package com.excep;

public class Employeeexcep extends Exception
{

	public Employeeexcep() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employeeexcep(String message) {
		super(message);
	    System.out.println(message);
	}

}
