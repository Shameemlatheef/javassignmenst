package com.masai;

public class Mygen<T>{
   
	T obj;
	void add(T obj) {
		this.obj=obj;
		
	}
	
	T get() {
		return obj;
	}
	


	public static void main(String[] args) {
		Mygen<String> m=new Mygen<>();
		m.add("shameem");
		System.out.println(m.get());
		Mygen<Integer> j=new Mygen<>();
		j.add(20);
		System.out.println(j.get());
		
		
	
	}
	
}
