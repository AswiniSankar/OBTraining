package com.corejava.assignments.day9.collections;


import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;




public class LinkedHashMapEx2 {

	
	public static void main(String[] args) {
		LinkedHashMap<Person,Integer> lh = new LinkedHashMap<Person,Integer>();
		lh.put( new Person(45, "Santhosh"),23);
		lh.put(new Person(8, "Meena"),46);
		lh.put(new Person(5, "Mathesh"),89);
		lh.put(new Person(23, "Clara"),70);
		lh.put(new Person(67, "Viji"),100);
		
		Set<Entry<Person, Integer>> m1 = lh.entrySet();
		for (Entry<Person, Integer> t : m1) {
			System.out.println(t.getKey()+" = "+t.getValue());
		}
		System.out.println("----sorted linked hash map----");
		TreeMap<Person, Integer> tm = new TreeMap<>(new SortById());
		tm.putAll(lh);
		Set<Entry<Person, Integer>> m11 = tm.entrySet();

		for (Entry<Person, Integer> t : m11) {
			System.out.println(t);
		}
	
	}

}


