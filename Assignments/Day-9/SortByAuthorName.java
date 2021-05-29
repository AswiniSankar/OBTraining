package com.corejava.assignments.day9.collections;

import java.util.Comparator;

public class SortByAuthorName implements Comparator<Books>{

	@Override
	public int compare(Books o1, Books o2) {
		
		return o1.name.compareTo(o2.name);
	}

}
