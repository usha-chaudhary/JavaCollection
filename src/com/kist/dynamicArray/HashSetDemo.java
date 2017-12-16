package com.kist.dynamicArray;

import java.util.HashSet;
//HashSet and LinkedHashSet
public class HashSetDemo {
	HashSet<String> h;
	public HashSetDemo(){
		h=new HashSet<>();
	}
	
	public void hashSetDemo(){
		h.add("usha");
		h.add("Chaudhary");
		
		//Iterator iterator=new Iterator();
		//HashSet<String> name=h;
		//System.out.println(name);
		
		System.out.println(h);
		System.out.println(h.size());
		System.out.println(h.contains("usha"));
		System.out.println(h.clone());
		System.out.println(h.isEmpty());
		System.out.println(h.remove("chaudhary")); 
		System.out.println();
		
		
	}

}
