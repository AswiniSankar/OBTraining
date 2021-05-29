package com.corejava.assignments.day9.collections;

import java.util.Comparator;

public class SortById implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		
		return o1.id-o2.id;
	}
	

}
