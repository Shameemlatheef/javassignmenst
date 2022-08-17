package com.masai;

import java.io.Serializable;

public class Student implements Serializable{
private int roll;
private String name;
Address address;


public Student(int roll, String name, Address address) {
	super();
	this.roll = roll;
	this.name = name;
	this.address = address;
}
public int getRoll() {
	return roll;
}
public void setRoll(int roll) {
	this.roll = roll;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}


@Override
public String toString() {
	return "Student [roll=" + roll + ", name=" + name + ", address=" + address + "]";
}
public Student() {
	super();
}
}
