package com.corejava.basics.day9.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

	public static void main(String[] args) {

		HashSet<Integer> hashSet = new HashSet<>();
		hashSet.add(10);
		hashSet.add(200);
		hashSet.add(null);
		hashSet.add(60);
		hashSet.add(10);// no duplicates
		hashSet.add(null);// one time only null value allowed
		System.out.println(hashSet);
		System.out.println(hashSet.size());
		Iterator<Integer> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
