package com.masai;

public class Child extends Parent{

	public Child() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args)  {
	try {
		Child c=new Child();
		c.fun1();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
