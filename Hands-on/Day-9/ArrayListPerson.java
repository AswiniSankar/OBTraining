package com.corejava.basics.day9.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPerson {

	public static void main(String[] args) {
		ArrayList<Person> plist = new ArrayList<>();
		plist.add(new Person(12, "Jhon"));
		plist.add(new Person(45, "Nithiya"));
		plist.add(new Person(20, "Mohan"));
		System.out.println(plist);
		for (Person p : plist) {
			System.out.println(p);
		}
		System.out.println("-----sorting-----");
		Collections.sort(plist);

		for (Person p : plist) {
			System.out.println(p);
		}
	}

}
