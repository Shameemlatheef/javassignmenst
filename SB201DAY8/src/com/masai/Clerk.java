package com.masai;

public class Clerk implements Collage {
	public void registerStudent(){
		 System.out.println("enroll the Student in Collage");
		}

	@Override
	public void doJob() {
		registerStudent();
		
	}
}
