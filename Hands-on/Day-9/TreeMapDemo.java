package com.corejava.basics.day9.collections;

import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.Map.Entry;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Employee, Integer> tm = new TreeMap<Employee, Integer>(new SortById());
		tm.put(new Employee(21, "Neeta"), 45);
		tm.put(new Employee(37, "Modi"), 5);
		tm.put(new Employee(5, "Aajith"), 20);
		Set<Map.Entry<Employee, Integer>> m1 = tm.entrySet();

		for (Entry<Employee, Integer> t : m1) {
			System.out.println(t);
		}
	}

}
