package com.corejava.assignments.day9.collections;

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
	TreeSet<Integer> ts = new TreeSet<>();
	ts.add(20);
	ts.add(5);
	ts.add(1);
	ts.add(90);
	ts.add(120);
	System.out.println("------ascending order------");
	for(Integer i : ts) {
		System.out.println(i);
	}
	TreeSet<Integer> res = (TreeSet<Integer>)ts.descendingSet();
	System.out.println("-------descending order------");
	for(Integer i : res) {
		System.out.println(i);
	}
	}

}
