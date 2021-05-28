package com.corejava.basics.day9.collections;

import java.util.Comparator;

public class SortByPCharacter implements Comparator<PersonForTreeSet>  {

	@Override
	public int compare(PersonForTreeSet o1, PersonForTreeSet o2) {
		// TODO Auto-generated method stub
		return o1.pCharacter.compareTo(o2.pCharacter);
	}
 
}
