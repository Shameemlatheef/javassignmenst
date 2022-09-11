package com.masai;

public class Tiger extends Animal {

	public Tiger() throws AnimaException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	void eat() throws AnimaException {
		// TODO Auto-generated method stub
		System.out.println("Tiger is eating");
	}
	public static void main(String[] args) {
		try {
		 Tiger t=new Tiger();
		 t.eat();
			
		} catch (AnimaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
