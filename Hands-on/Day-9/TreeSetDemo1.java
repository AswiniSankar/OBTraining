package com.corejava.basics.day9.collections;
import java.util.TreeSet;
public class TreeSetDemo1 {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(100);
		ts.add(20);
		ts.add(20);//no duplicates
		ts.add(40);
		System.out.println(ts);//automatically sort
		System.out.println(ts.size());
	}

}
