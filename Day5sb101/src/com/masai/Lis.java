package com.masai;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class Lis {
public static void main(String[] args) {
	List<String> a=new ArrayList<>();
	a.add("delhi");
	a.add("pune");
	a.add("hyd");
	a.add("westbengal");
	a.add("kerala");
	a.add("tamilnadu");
	
	//Collections.sort(a,Collections.reverseOrder());
	
	Collections.sort(a,(a1,a2)->{
		return a2.compareTo(a1);
	});
	System.out.println(a);
	
}
}
