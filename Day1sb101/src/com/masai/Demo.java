package com.masai;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo {

	
	public static void main(String[] args) {
		HashMap<String, String> m=new HashMap<>();
		m.put("maharastra", "mumbai");
		m.put("kerala", "tvm");
		m.put("tamilnadu","chennai");
		m.put("westbengal","kolkata");
		m.put("karnataka","banglore");
		
		
		Set<String> keys=m.keySet();
		for(String s:keys) {
			System.out.println(s);
		}
		
		
		Collection<String> c=m.values();
		for(String d:c) {
			System.out.println(d);
		}
		
		
		System.out.println("printing the keys and values");
		Set<Map.Entry<String, String>> k=m.entrySet();
		for(Map.Entry<String, String> n:k ) {
			System.out.println(n.getKey()+"------"+n.getValue());
		}
		
	}
	
	
}
