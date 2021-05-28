package com.corejava.basics.day9.collections;

import java.util.Comparator;

public class PersonForTreeSet implements Comparator<PersonForTreeSet> {
	int id;
	String pname;
	String pCharacter;

	public PersonForTreeSet(int id, String pname, String pCharacter) {
		super();
		this.id = id;
		this.pname = pname;
		this.pCharacter = pCharacter;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getpCharacter() {
		return pCharacter;
	}

	public void setpCharacter(String pCharacter) {
		this.pCharacter = pCharacter;
	}

	@Override
	public String toString() {
		return "PersonForTreeSet [id=" + id + ", pname=" + pname + ", pCharacter=" + pCharacter + "]";
	}

	@Override
	public int compare(PersonForTreeSet o1, PersonForTreeSet o2) {

		return o1.pCharacter.compareTo(o2.pCharacter);
	}

}
