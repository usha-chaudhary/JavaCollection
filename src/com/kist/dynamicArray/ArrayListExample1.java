package com.kist.dynamicArray;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListExample1 {
	String first,last;
	ArrayList<String> al;
	public ArrayListExample1(String s,String s1){
		al=new ArrayList<>();
		first=s;
		last=s1;
	}
	public void arrayList(){
		al.add("Universe");
		al.add("Blackhole");
		al.add("Space");
		al.add("Sun");
		al.add("Earth");
		al.add("Live");
		//al.clear();
	al.set(0, "TimeTravel");
	//System.out.println(al.get(1));
	System.out.println(al.size());
	//System.out.println(al);
	
	ListIterator i= al.listIterator();
	while(i.hasNext()){
		Object string= i.next();
		System.out.println(string);
	}
	}

}
