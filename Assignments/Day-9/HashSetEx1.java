package com.corejava.assignments.day9.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSetEx1 {


	public static void main(String[] args) {
		HashSet<Student> hs = new HashSet<>();
		hs.add(new Student(23, "Aswini", 90));
		hs.add(new Student(10, "Pavithara", 74));
		hs.add(new Student(90, "Nega", 60));
		hs.add(new Student(13,"Yamini", 80));
		hs.add(new Student(16, "Raja", 60));
		Iterator<Student> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("------sorted set------");
	    TreeSet<Student> ts = new TreeSet<Student>();
	    ts.addAll(hs);
		for(Student s: ts) {
			System.out.println(s);
		}
	}
}