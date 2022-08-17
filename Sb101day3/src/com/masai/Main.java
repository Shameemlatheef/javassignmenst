package com.masai;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
public static void main(String[] args) {
	List<Student> al=new ArrayList<>();
	al.add(new Student(15,500,"ram"));
	al.add(new Student(12,200,"shamem"));
	al.add(new Student(14,300,"micheal"));
	al.add(new Student(20,400,"safal"));
   List<Student> l=al.stream().filter(n -> n.getMarks()<800).collect(Collectors.toList());
    
    System.out.println(l);
    
	
}
}
