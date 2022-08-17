package com.masai;

public class Demo {

	public static <E> void print(E[] jj) {
		for(E e:jj) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		Integer[] jj= {1,2,3,4,5};
		print(jj);
	}
	
}
