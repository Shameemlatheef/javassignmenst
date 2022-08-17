package com.masai;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
 public static void main(String[] args) {
	List<Student1> k=new ArrayList<Student1>();
	k.add(new Student1(15,500,"ram"));
	k.add(new Student1(12,200,"shamem"));
    k.add(new Student1(14,300,"micheal"));
	k.add(new Student1(20,400,"safal"));
	Stream<Student1> jj=k.stream();
	List<E> gg=jj.collect(Collectors.toList());
	
	
}
}
