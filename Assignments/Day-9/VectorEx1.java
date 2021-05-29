package com.corejava.assignments.day9.collections;

import java.util.Iterator;
import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("Coimbatore");
		v.add("Thirchy");
		v.add("Chennai");
		v.add("madurai");
		v.add("Pondy");
		System.out.println("----------Without using for---------");
		System.out.println(v);
		System.out.println("----------using for each loop-------");
		for (String s : v) {
			System.out.println(s);
		}
		Iterator<String> it = v.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		v.add(1, "Dindugal"); // push the value right and get inserted
		System.out.println("----------Without using for---------");
		System.out.println(v);
		System.out.println("capacity : " + v.capacity());
		System.out.println(v.elementAt(3));
		System.out.println("-------using for loop--------");
		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}
		System.out.println("First Element " + v.firstElement());
		System.out.println(v.indexOf("madurai"));
		System.out.println(v.lastElement());
		v.remove("madurai");
		System.out.println(v);
		v.sort(null);
		System.out.println(v);
	}

}
