package com.masai;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student> {
	private int roll;
	private int marks;
	private String name;
	public Student(int roll, int marks, String name) {
		super();
		this.roll = roll;
		this.marks = marks;
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(marks, name, roll);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return marks == other.marks && Objects.equals(name, other.name) && roll == other.roll;
	}
	public Student() {
		super();
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", marks=" + marks + ", name=" + name + "]";
	}
//	@Override
//	public int compare(Student o1, Student o2) {
//	 if	(o1.getRoll() > o2.getRoll() ){
//		 return +1;
//	 }
//	 else if(o1.getRoll()<o2.getRoll()) {
//		 return -1;
//	 }
//	 else
//		return 0;
//	}
	@Override
	public int compareTo(Student o) {
		Student s1=this;
		Student s2=(Student)o;
		return s1.getRoll()>s2.getRoll() ? +1:-1;		
	   }
}
