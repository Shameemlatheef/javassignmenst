package com.masai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
public static void main(String[] args) {
	List<Product> l=new ArrayList<>();

	l.add(new Product(10,"shameem",20,30));
	l.add(new Product(11,"micheal",22,40));
	l.add(new Product(15,"senan",25,50));
	l.add(new Product(16,"Safal",60,79));
	l.add(new Product(17,"dilli",57,39));
	l.add(new Product(19,"Rolex",38,27));
Collections.sort(l,(a1,a2) ->{
	return a1.price>a2.price ? +1:-1;
	});
System.out.println(l);
}
}
