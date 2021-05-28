package com.corejava.basics.day9.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWorking {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		System.out.println(arrayList); // default empty array
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		System.out.println(arrayList);
		arrayList.add(2, 90);// add using index it pushes remaining elements by 1 time right and value get
								// inserted
		System.out.println(arrayList);
		arrayList.set(1, 100);// replace element using set
		System.out.println(arrayList);
		arrayList.add(90);
		arrayList.add(30);
		arrayList.add(20);
		arrayList.add(90);
		arrayList.add(46);
		System.out.println(arrayList);
		System.out.println(arrayList.lastIndexOf(90));// prints last index of that number
		List<Integer> sublist = arrayList.subList(1, 3);// endIndex excluded
		System.out.println(sublist);
		System.out.println(arrayList.size());
		System.out.println(sublist.size());
		System.out.println(arrayList.containsAll(sublist));// checks all the elements in arraylist
		System.out.println("---sorted array----");
		arrayList.sort(null);
		System.out.println(arrayList);
		System.out.println("----get using indexing-----");
		System.out.println(arrayList.get(2));
		System.out.println("---sublist of list---");
		System.out.println(arrayList.subList(1, 3));
		System.out.println("----get the index of elemnts----");
		System.out.println(arrayList.indexOf(new Integer(30)));// passing value
		System.out.println(arrayList.indexOf(90));// passing object

	}

}
