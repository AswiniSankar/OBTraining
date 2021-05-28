package com.corejava.basics.day9.collections;

import java.util.Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HaspMapDemo1 {

	public static void main(String[] args) {
		HashMap<String, Integer> h1 = new HashMap<>();
		h1.put("one", 1);
		h1.put("two", 2);
		h1.put("three", 3);
		
		Set<Map.Entry<String, Integer>> m1 = h1.entrySet();
		for(Entry<String, Integer> iter : m1) {
			System.out.println(iter.getKey()+" = "+iter.getValue());
		}
		// printing all keys
		// Collection<String> s1 = h1.keySet();
		Set<String> s1 = h1.keySet();
		for (String s : s1) {
			System.out.println(s);
		}
		// printing all values
		Collection<Integer> s2 = h1.values();
		for (Integer s : s2) {
			System.out.println(s);
		}
	}

}
