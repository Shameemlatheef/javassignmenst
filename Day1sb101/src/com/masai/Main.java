package com.masai;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {
public static void main(String[] args) {
	TreeMap<Student, String> m=new TreeMap<>(new MArkcom());
	m.put(new Student(12,200,"shameem"), "tamilnadu");
	m.put(new Student(10,290,"micheal"), "kerala");
	m.put(new Student(20,300,"nussu"), "kashmir");
	m.put(new Student(25, 150, "senanl"),"karnataka");
	Set<Map.Entry<Student, String>> k=m.entrySet();
	for(Map.Entry<Student, String> n:k ) {
		System.out.println(n.getKey()+"------"+n.getValue());
		System.out.println(n.getKey().getMarks());
		System.out.println(n.getKey().getName());
	}

}
}