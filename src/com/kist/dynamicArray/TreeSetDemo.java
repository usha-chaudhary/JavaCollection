
package com.kist.dynamicArray;
import java.util.Iterator;
import java.util.TreeSet;

	public class TreeSetDemo {
		TreeSet<Integer> ts;
	
	public TreeSetDemo(){
		ts=new TreeSet<>();
	}
	public void treeSetDemo(){
		ts.add(1);
		ts.add(2);
		ts.add(34);
		ts.add(40);
//ts.addAll(1,2,3,4,5);
//System.out.println(ts);
	Iterator li=ts.iterator();
		while(li.hasNext()){
			Object number=li.next();
			System.out.print(number+" ");
		}
		System.out.println();
		System.out.println(ts.pollFirst());
		System.out.println(ts.pollLast());
	}
}
