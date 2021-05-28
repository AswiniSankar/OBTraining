package com.corejava.basics.day9.collections;

import java.util.Comparator;

public class SortByPersonName implements Comparator<PersonForTreeSet> {

	@Override
	public int compare(PersonForTreeSet o1, PersonForTreeSet o2) {
		
		return o1.pname.compareTo(o2.pname);
	}
	

}
