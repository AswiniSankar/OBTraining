package com.corejava.assignments.day9.collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHaspMapEx {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lh = new LinkedHashMap<>();
		System.out.println("Size of HashMap :" + lh.size());

		lh.put(123, "TajMahal");
		lh.put(56, "Nayakar Mahal");
		lh.put(80, "Vellore Fort");
		lh.put(46, "Marina Beach");
		lh.put(46, "Marina Beach");// duplicates of key
		lh.put(124, "Marina Beach");// duplicate of value allow
		// print direct key and values
		// System.out.println(lh.keySet());
		// System.out.println(lh.values());
		Set<Map.Entry<Integer, String>> m1 = lh.entrySet();
		for (Entry<Integer, String> t : m1) {
			System.out.println(t.getKey() + "  =   " + t.getValue());
		}
		lh.remove(80);// remove by key value
		lh.replace(46, "Marina Beach", "Red Fort");// replace by old value and key
		lh.replace(123, "Taj Mahal");// replace by key value
		for (Entry<Integer, String> t : m1) {
			System.out.println(t.getKey() + "  =   " + t.getValue());
		}
		System.out.println("------clonned HashMap------");
		LinkedHashMap<Integer, String> lh1 = (LinkedHashMap<Integer, String>) lh.clone();
		Set<Map.Entry<Integer, String>> m2 = lh1.entrySet();
		for (Entry<Integer, String> t : m2) {
			System.out.println(t.getKey() + "  =   " + t.getValue());
		}
		lh.clear();// linked hashmap get cleared
		System.out.println("Size of HashMap :" + lh.size());
		for (Entry<Integer, String> t : m1) {
			System.out.println(t.getKey() + "  =   " + t.getValue());
		}
	}

}
