package com.corejava.basics.day9.collections;

import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
	TreeSet<PersonForTreeSet> ts = new TreeSet<>(new SortByPCharacter()); //SortByPersonname can also be given
	ts.add(new PersonForTreeSet(12, "Arun", "Good"));
	ts.add(new PersonForTreeSet(37, "Xavior", "Moderate"));
	ts.add(new PersonForTreeSet(901, "Prathap", "Bad"));
	ts.add(new PersonForTreeSet(11, "Megna", "Poor"));
	ts.add(new PersonForTreeSet(20, "Yazhini", "Very Good"));
    for(PersonForTreeSet p : ts) {
    	System.out.println(p.pname+" "+p.pCharacter);
    }
	}

}
